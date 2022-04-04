package io.codelex.test.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    protected String number;
    protected String ownerFullName;
    protected String ccvCode;
    protected BigDecimal balance;

    public Card(String number, String ownerFullName, String ccvCode, BigDecimal balance) {
        this.number = number;
        this.ownerFullName = ownerFullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public String getCcvCode() {
        return ccvCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addMoney(BigDecimal money) {
        balance = balance.add(money);
    }

    public void takeOutMoney(BigDecimal money) throws NotEnoughFundsException {
        balance = balance.subtract(money);
    }
}
