package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        String format;
        if (this.balance >= 0) {
            format = String.format("%s, $%.2f", this.name, this.balance);
        } else {
            format = String.format("%s, -$%.2f", this.name, Math.abs(this.balance));
        }
        return format;
    }

}
