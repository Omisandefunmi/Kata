package e_Banking;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        runBankApp();
    }

    private static final String WELCOME_ADDRESS = """
            WELCOME TO GTB
                
            PRESS:
            1 --> OPEN AN ACCOUNT
            2 --> LOG IN
            3 --> EXIT""";
    private static final String TRANSACTIONS_OPTIONS = """
                
                1 --> CHECK BALANCE
                2 --> CREDIT ACCOUNT
                3 --> WITHDRAW
                4 --> MAKE TRANSFER
                5 --> CHANGE PIN
                6 --> BUY AIRTIME
                7 --> BUY DATA
                8 --> CLOSE ACCOUNT
                9 --> LOG OUT""";
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank gtb = new Bank("gtb");

    private static String cacheAccountNumber;
    private static String cachePin;

    private static boolean banking = true;


    public static void runBankApp(){
        while(banking){
            displayHomePage();
            selectLogInChoice();

        }
    }

    public static void displayTransactionOptions(){
        if (cacheAccountNumber != null && cachePin != null){
            System.out.println(TRANSACTIONS_OPTIONS);
            chooseTransactionType();}
        else {
            System.out.printf("""
                    You do not have an account with us at %s
                    Will you like to open an account now?(Yes/no) %n""", gtb.getBankName().toUpperCase());
            String openAccountChoice = scanner.nextLine();
            switch (openAccountChoice.toLowerCase()) {
                case "yes" -> openAccount();
                case "no" -> {System.out.println("Thank you for visiting " + gtb.getBankName().toUpperCase());
                                exit();}
                default -> {
                    System.out.println("Dear customer, you may have entered an unrecognized option!!!");
                    displayTransactionOptions();
                }
            }
        }
    }

    private static void selectLogInChoice(){
        String logInChoice = scanner.nextLine();
        switch (logInChoice) {
            case "1" -> openAccount();
            case "2" -> displayTransactionOptions();
            case "3" -> exit();
            default -> {
                System.out.println("Invalid input");
                displayHomePage();
                selectLogInChoice();
            }
        }

    }
    public static void displayHomePage(){
        System.out.println(WELCOME_ADDRESS);
        selectLogInChoice();
    }



    private static void chooseTransactionType(){
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> checkBalance();
            case "2" -> creditAccount();
            case "3" -> withdrawFromAccount();
            case "4" -> transfer();
            case "5" -> changePin();
            case "6" -> buyAirtime();
            case "7" -> buyData();
            case "8" -> closeAccount();
            case "9" -> logOut();
            default -> {
                System.out.println("Invalid input");
                displayTransactionOptions();
            }
        }
    }



    private static void changePin() {

        System.out.println("Enter old pin: ");
        String oldPin = scanner.nextLine();

        System.out.println("Enter new pin");
        String newPin = scanner.nextLine();

        System.out.println("Re-enter new pin");
        String newPin2 = scanner.nextLine();

        if (gtb.resetPassword(cacheAccountNumber, oldPin, newPin, newPin2)){
            System.out.println("Password change successful!!!");
        }
        else{
            System.out.println("""
                    Password change fail!!!
                    
                    Ensure that you provide the correct details""");
        }
        displayTransactionOptions();

    }

    private static void transfer() {
        System.out.println("How much do you want to transfer?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter beneficiary's account number: ");
        String receiver = scanner.nextLine();
        System.out.println("Enter your pin to complete this transaction: ");
        String pin = scanner.nextLine();
        if(pin.equals(cachePin)) {
            if (amount < gtb.checkBalanceOf(cacheAccountNumber)) {
                gtb.transfer(amount, cacheAccountNumber, receiver, pin);
                System.out.println("Transfer successful");
            }
            else{
                System.out.println("Dear customer, your account balance is insufficient for this transaction");}
        }
        else{
            System.out.println("Incorrect pin");
        }
        displayTransactionOptions();
    }

    private static void openAccount() {
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name");
        String lastName = scanner.nextLine();

        System.out.println("Set pin for account");
        String pin = scanner.nextLine();

        System.out.println("Enter your bank verification number");
        String bvn = scanner.nextLine();

        cacheAccountNumber = gtb.createAccount(lastName, firstName, pin, bvn);
        cachePin = pin;
        System.out.println(gtb.getBankName().toUpperCase()+" Account created with account number "+cacheAccountNumber);
        displayTransactionOptions();


    }

    private static void checkBalance() {
        System.out.println("Dear customer, your account balance is "+gtb.checkBalanceOf(cacheAccountNumber)+ " naira");
        displayTransactionOptions();

    }

    private static void creditAccount() {
        System.out.println("How much do you want to pay?");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        gtb.deposit(amount, cacheAccountNumber);
        System.out.println("Transaction successful!!!");
        displayTransactionOptions();
    }

    private static void withdrawFromAccount() {
        System.out.println("How much do you want to withdraw?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter pin");
        String pin = scanner.nextLine();
        if(pin.equals(cachePin)) {
            if (gtb.withdrawFrom(cacheAccountNumber, amount, pin)) {
                System.out.println("Withdraw successful!!!");
            } else {
                System.out.println("Insufficient balance!!!");
            }
        }
        else{
            System.out.println("Pin is Incorrect");
        }
        displayTransactionOptions();
    }

    private static void buyAirtime() {
        System.out.println("""
                Select network
                
                1 --> Mtn
                2 --> Airtel
                3 --> Glo
                4 --> Etisalat
                5 --> Exit""");
        String network = scanner.nextLine();
        switch (network) {
            case "1" -> mtnAirtime();
            case "2" -> airtelAirtime();
            case "3" -> gloAirtime();
            case "4" -> etisalatAirtime();
            case "5" -> {
                displayTransactionOptions();
                chooseTransactionType();
            }
            default -> {
                System.out.println("Invalid input");
                buyAirtime();
            }
        }
    }
        private static void mtnAirtime() {
            System.out.println("Enter how much airtime you want to buy?");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
                System.out.println("Mtn airtime purchase successful");
            }
            else
                System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");
        }

        private static void airtelAirtime() {
            System.out.println("Enter how much airtime you want to buy?");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
                System.out.println("Airtel airtime purchase successful");
            }
            else
                System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");
        }

        private static void gloAirtime() {
            System.out.println("Enter how much airtime you want to buy?");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
                System.out.println("Glo airtime purchase successful");
            }
            else
                System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");
        }

        private static void etisalatAirtime() {
            System.out.println("Enter how much airtime you want to buy?");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
                System.out.println("Etisalat airtime purchase successful");
            }
            else {
                System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");
            }
    }

    private static void buyData() {
        System.out.println("""
                Select network
                
                1 --> Mtn
                2 --> Airtel
                3 --> Glo
                4 --> Etisalat
                5 --> Exit""");
        String network = scanner.nextLine();
        switch (network) {
            case "1" -> mtnData();
            case "2" -> airtelData();
            case "3" -> gloData();
            case "4" -> etisalatData();
            case "5" -> displayTransactionOptions();
            default -> {
                System.out.println("Invalid input");
                buyData();
            }
        }
    }
    private static void mtnData() {
        System.out.println("Enter how much data you want to buy(in naira)?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
            System.out.println("Mtn data purchase successful");
        }
        else{
            System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");}
    }

    private static void airtelData() {
        System.out.println("Enter how much data you want to buy(in naira)?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
            System.out.println("Airtel data purchase successful");
        }
        else
            System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");
    }

    private static void gloData() {
        System.out.println("Enter how much data you want to buy(in naira)?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
            System.out.println("Glo data purchase successful");
        }
        else{
            System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");}
    }

    private static void etisalatData() {
        System.out.println("Enter how much data you want to buy(in naira)?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (gtb.withdrawFrom(cacheAccountNumber,amount,cachePin)){
            System.out.println("Etisalat data purchase successful");
        }
        else{
            System.out.println("""
                        Failed transaction
                        Insufficient fund!!!""");}
    }


    private static void closeAccount() {
        System.out.printf("""
                DANGEROUS OPERATION!!!
                Account, if closed, can not be retrieved.
                DISCLAIMER!!!
                
                %s will not be responsible for data lost during this operation.
                
                Do you wish to continue?
                (YES/N0) %n""", gtb.getBankName().toUpperCase());

        String closeAccountChoice = scanner.nextLine();

        switch (closeAccountChoice.toLowerCase()) {
            case "yes" -> implementCloseAccount();
            case "no" -> displayTransactionOptions();
            default -> {
                System.out.println("Unrecognized value inputted");
                displayTransactionOptions();
            }
        }


    }

    private static void implementCloseAccount() {
        System.out.println("Enter your bank verification number");
        String bvn = scanner.nextLine();

        System.out.println("Enter your pin");
        String pin = scanner.nextLine();

        if(gtb.closeAccount(cacheAccountNumber, bvn)){
            System.out.println("Account closed successfully");}
        else
            System.out.println("""
                    Account close unsuccessfully!!!
                    
                    Enter correct details or visit our nearest branch for assistance""");
        displayTransactionOptions();
    }

    private static void logOut() {
        displayHomePage();
    }
    private static void exit() {
        System.out.println("THANK YOU FOR BANKING WITH US");
        banking = false;
    }
}
