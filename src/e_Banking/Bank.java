package e_Banking;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private int numberOfCustomers;
    private ArrayList <Account>accounts;


    public Bank(String bankName){
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public String createAccount(String lastName, String firstName, String pin, String bvn) {

        numberOfCustomers++;
        String accountNumber = numberOfCustomers+"";
        Account account = new Account(firstName, lastName, accountNumber, pin, bvn);
        accounts.add(account);
        return accountNumber;
    }

    public boolean closeAccount(String accountNumber, String bvn) {
        for (int i = 0; i < accounts.size(); i++) {
            Account foundAccount = accounts.get(i);
            if(foundAccount.bvnIsValid(bvn)){
                if (foundAccount.getAccountNumber().equals(accountNumber)){
                    accounts.remove(foundAccount);
                    numberOfCustomers--;
                    return true;
                }
            }
        }
         return false;
        }

    public void transfer(double amount, String senderAccountNumber, String receiverAccountNum, String senderPin) {
        Account senderAccount = findAccount(Integer.parseInt(senderAccountNumber));
        Account receiverAccount = findAccount(Integer.parseInt(receiverAccountNum));

        senderAccount.withdraw(amount, senderPin);
        receiverAccount.deposit(amount);
    }

    public Account findAccount(int accountNumber) {
       int index = accountNumber - 1;

        return accounts.get(index);
    }


    public double checkBalanceOf(String accountNumber) {
        Account account = findAccount(Integer.parseInt(accountNumber));
        return account.getBalance();
    }

    public void deposit(double amount, String accountNumber) {
        Account beneficiary = findAccount(Integer.parseInt(accountNumber));
        beneficiary.deposit(amount);

    }

    public boolean withdrawFrom(String accountNumber, double amount, String pin) {
        Account account = findAccount(Integer.parseInt(accountNumber));
        return account.withdraw(amount, pin);
    }


    public boolean resetPassword(String accountNumber, String oldPin, String newPin, String newPin2) {
        Account password = findAccount(Integer.parseInt(accountNumber));
        return password.changePassword(oldPin, newPin, newPin2);
        }

}

