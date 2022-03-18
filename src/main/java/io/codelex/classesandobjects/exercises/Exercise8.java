package io.codelex.classesandobjects.exercises;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        SavingsAccount usersAccount = new SavingsAccount(0);

        Scanner in = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double balance = in.nextDouble(); // user enter 10000
        usersAccount.setBalance(balance);

        System.out.print("Enter annual interest rate: ");
        double rate = in.nextDouble(); // user enter 5
        usersAccount.setAnnualInterestRate(rate);

        System.out.print("How long has the account been opened? ");
        int months = in.nextInt(); // user enter 4

        double countDeposit = 0;
        double countWithdrawn = 0;
        double countInterest = 0;

        for (int i=1; i<=months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double amount = in.nextDouble(); // user enter 100
            countDeposit += amount;
            usersAccount.deposit(amount);

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double amount2 = in.nextDouble(); // user enter 230
            countWithdrawn += amount2;
            usersAccount.withdrawal(amount2);

            countInterest += usersAccount.monthlyInterest();
        }

        String numberFormatting1 = currencyWithChosenLocalisation(countDeposit, new Locale("en", "US"));
        String numberFormatting2 = currencyWithChosenLocalisation(countWithdrawn, new Locale("en", "US"));
        String numberFormatting3 = currencyWithChosenLocalisation(countInterest, new Locale("en", "US"));
        String numberFormatting4 = currencyWithChosenLocalisation(usersAccount.getBalance(), new Locale("en", "US"));

        System.out.println("Total deposited: " + numberFormatting1);
        System.out.println("Total withdrawn: " + numberFormatting2);
        System.out.println("Interest earned: " + numberFormatting3);
        System.out.println("Ending balance: " + numberFormatting4);
    }

    public static String currencyWithChosenLocalisation(double value, Locale locale) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(value);
    }
}
