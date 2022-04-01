package io.codelex.test.exercise1;

public class testCards {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard johnCreditCard = new CreditCard("2453623463463", "John Bert", "023", 50.50);
        DebitCard marksDebitCard = new DebitCard("2114123235", "Mark Luice", "678", 10000);
        System.out.println(johnCreditCard);
        System.out.println(marksDebitCard);

        johnCreditCard.addMoney(6);
        System.out.println(johnCreditCard);

        marksDebitCard.addMoney(300);
        System.out.println(marksDebitCard);


        try {
            johnCreditCard.takeOutMoney(20.50);
            System.out.println(johnCreditCard);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

        try {
            marksDebitCard.takeOutMoney(10300);
            System.out.println(marksDebitCard);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

    }
}

