package io.codelex.test.exercise1;

import java.math.BigDecimal;

public class testCards {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard johnCreditCard = new CreditCard("2453623463463", "John Bert", "023", BigDecimal.valueOf(50.50));
        DebitCard marksDebitCard = new DebitCard("2114123235", "Mark Luice", "678", BigDecimal.valueOf(10001));
        System.out.println(johnCreditCard);
        System.out.println(marksDebitCard);

        johnCreditCard.addMoney(BigDecimal.valueOf(6));
        System.out.println(johnCreditCard);

        marksDebitCard.addMoney(BigDecimal.valueOf(300));
        System.out.println(marksDebitCard);

        try {
            johnCreditCard.takeOutMoney(BigDecimal.valueOf(20.50));
            System.out.println(johnCreditCard);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

        try {
            marksDebitCard.takeOutMoney(BigDecimal.valueOf(10302));
            System.out.println(marksDebitCard);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

    }
}

