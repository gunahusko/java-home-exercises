package io.codelex.classesandobjects.exercises;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount();

        Scanner in = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double balance = in.nextDouble(); // user enter 10000
        a.setBalance(balance);

        System.out.print("Enter annual interest rate: ");
        double rate = in.nextDouble(); // user enter 5
        a.setAnnualInterestRate(rate);

        System.out.print("How long has the account been opened? ");
        int months = in.nextInt(); // user enter 4

        double countDeposit = 0;
        double countWithdrawn = 0;
        double countInterest = 0;

        for (int i=1; i<=months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double amount = in.nextDouble(); // user enter 100
            countDeposit += amount;
            a.deposit(amount);

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double amount2 = in.nextDouble(); // user enter 230
            countWithdrawn += amount2;
            a.withdrawal(amount2);

            countInterest += a.monthlyInterest();
        }

        String f1 = currencyWithChosenLocalisation(countDeposit, new Locale("en", "US"));
        String f2 = currencyWithChosenLocalisation(countWithdrawn, new Locale("en", "US"));
        String f3 = currencyWithChosenLocalisation(countInterest, new Locale("en", "US"));
        String f4 = currencyWithChosenLocalisation(a.getBalance(), new Locale("en", "US"));

        System.out.println("Total deposited: " + f1);
        System.out.println("Total withdrawn: " + f2);
        System.out.println("Interest earned: " + f3);
        System.out.println("Ending balance: " + f4);
    }

    public static String currencyWithChosenLocalisation(double value, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(value);
    }
}
