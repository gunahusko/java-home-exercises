package io.codelex.test.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditCard extends Card {

    public CreditCard(String number, String ownerFullName, String ccvCode, BigDecimal balance) {
        super(number, ownerFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(BigDecimal money) {
        super.addMoney(money);
    }

    @Override
    public void takeOutMoney(BigDecimal money) throws NotEnoughFundsException {
        BigDecimal hundred = new BigDecimal(100);

        if (balance.compareTo(BigDecimal.ZERO) == 0 || balance.compareTo(money) < 0) {
            System.out.println("You want take out " + money.setScale(2, RoundingMode.HALF_UP));
            throw new NotEnoughFundsException("Balance is " + balance.setScale(2, RoundingMode.HALF_UP));
        } else if (balance.compareTo(hundred) < 0) {
            System.out.println("Warning: Low funds");
        }
        super.takeOutMoney(money);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", ccvCode='" + ccvCode + '\'' +
                ", balance=" + balance.setScale(2, RoundingMode.HALF_UP) +
                '}';
    }
}
