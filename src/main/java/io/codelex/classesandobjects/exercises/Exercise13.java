package io.codelex.classesandobjects.exercises;
import io.codelex.classesandobjects.practice.Account;

public class Exercise13 {

    public static void main(String[] args) {
        Account bill = new Account("Bill's account", 100.00d);
        bill.deposit(20.00d);
        System.out.println(bill);

        Account matt = new Account("Matt's account", 1000.00d);
        Account myAccount = new Account("My account's", 0.00d);
        matt.withdrawal(100.00d);
        myAccount.deposit(100.00d);

        System.out.println(matt);
        System.out.println(myAccount);
        System.out.println("____________________________");

        Account a = new Account("A", 100.00d);
        Account b = new Account("B", 0.00d);
        Account c = new Account("C", 0.00d);

        transfer(a, b ,50.00d);
        transfer(b, c, 25.00d);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        System.out.println("Money transfer from " + from.getOWNER() + " to " + to.getOWNER());
        System.out.println(from.getOWNER() + " account balance (before transfer): " + from.balance());
        System.out.println(to.getOWNER() + " account balance (before transfer): " + to.balance());
        System.out.println();
        from.withdrawal(howMuch);
        System.out.println(from.getOWNER() + " account balance (after transfer): " + from.balance());
        to.deposit(howMuch);
        System.out.println(to.getOWNER() + " account balance (after transfer): " + to.balance());
        System.out.println("____________________________");
    }


}
