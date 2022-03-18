package io.codelex.classesandobjects.exercises;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double amount) {
        balance = amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double monthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double earned = balance * monthlyInterestRate;
        balance += earned;
        return earned;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
