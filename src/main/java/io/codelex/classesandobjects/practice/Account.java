package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private final String OWNER;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.OWNER = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return this.balance;
    }

    public String getOWNER() {
        return OWNER;
    }

    @Override
    public String toString() {
        return OWNER + " balance: " + balance;
    }
}
