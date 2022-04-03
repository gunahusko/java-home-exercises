package io.codelex.test.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    protected String number;
    protected String ownerFullName;
    protected String ccvCode;
    protected BigDecimal balance;

    public Card(String number, String ownerFullName, String ccvCode, double balance) {
        this.number = number;
        this.ownerFullName = ownerFullName;
        this.ccvCode = ccvCode;
        this.balance = BigDecimal.valueOf(balance);
    }

    public abstract void addMoney(double money);
    public abstract void takeOutMoney(double money) throws NotEnoughFundsException;
}
