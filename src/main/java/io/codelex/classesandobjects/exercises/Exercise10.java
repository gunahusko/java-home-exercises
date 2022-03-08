package io.codelex.classesandobjects.exercises;

import io.codelex.classesandobjects.practice.BankAccount;

public class Exercise10 {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("Bob", 0.00);

        customer1.deposit(100.00);
        System.out.println(customer1);

        customer1.withdraw(200.00);
        System.out.println(customer1);
    }
}
