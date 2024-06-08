package com.mycompany.bank_account;

public class Bank_Account {
    int accountNumber;
    double balance;

    public Bank_Account(int accNum, double bal) {
        accountNumber = accNum;
        balance = bal;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void takeMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough money");
        }
    }

    public static void main(String[] args) {
        Bank_Account acc1 = new Bank_Account(123, 1000.0);
        acc1.addMoney(500.0);
        acc1.takeMoney(200.0);
        System.out.println("Account Number: " + acc1.accountNumber + ", Balance: " + acc1.balance);

        Bank_Account acc2 = new Bank_Account(456, 200.0);
        acc2.addMoney(300.0);
        acc2.takeMoney(100.0);
        System.out.println("Account Number: " + acc2.accountNumber + ", Balance: " + acc2.balance);
    }
}