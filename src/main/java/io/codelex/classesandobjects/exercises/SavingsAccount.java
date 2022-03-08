package io.codelex.classesandobjects.exercises;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount() {
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double monthlyInterest() {
        double monthlyInterestRate = this.annualInterestRate / 100 / 12; // (ja šeit nedala ar 100 (% likme), tad ir kā uzdevumā - manuprāt, kļūda uzdevumā
        double earned = this.balance * monthlyInterestRate;
        this.balance += earned;
        return earned;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
