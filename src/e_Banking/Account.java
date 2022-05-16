package e_Banking;

import java.util.InputMismatchException;

public class Account {




    private String fullName;
    private String accountNumber;
    private String pin;
    private String bvn;
    private double balance;
    private boolean pinIsValid;
    private boolean bvnIsValid;

    public Account(String firstName, String lastName, String accountNumber, String pin, String bvn) {
        this.fullName = lastName+ " "+firstName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.bvn = bvn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String lastName, String firstName) {
        this.fullName = lastName+ " "+firstName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    private void setPin(String pin) {
        this.pin = pin;
    }

    private String getPin() {
        return pin;
    }

    public void setBVN(String bvn) {
        this.bvn = bvn;
    }

    public String getBVN() {
        return bvn;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            return balance += amount;
        } else
            return balance;
    }

    public boolean pinIsValid(String pin){
        return pinIsValid = getPin().equals(pin);
    }


    public boolean bvnIsValid(String bvn){
        return bvnIsValid = getBVN().equals(bvn);
    }


    public boolean withdraw(double amount, String pin) {
       pinIsValid(pin);
        if(pinIsValid) {
            if (amount > 0 && amount < balance){
                 balance -= amount;
                 return true;
            }
            else
                return false;
        }
        else {
            System.out.println("Pin Incorrect!!!");
        }
        return false;
    }

    public boolean changePassword(String existingPin, String newPin, String newPin2) {
        pinIsValid(existingPin);
        if(newPin.equals(newPin2)){
           setPin(newPin);
           return true;
        }
        return false;
    }
}
