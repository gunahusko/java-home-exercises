package io.codelex.test.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DebitCard extends Card {
    public DebitCard(String number, String ownerFullName, String ccvCode, double balance) {
        super(number, ownerFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double money) {
        BigDecimal tenThousand = BigDecimal.valueOf(10000);

        if (balance.compareTo(tenThousand) > 0) {
            System.out.println("Warning: Too much money");
        }
        balance = balance.add(BigDecimal.valueOf(money));
    }

    @Override
    public void takeOutMoney(double money) throws NotEnoughFundsException {
        if (balance.compareTo(BigDecimal.ZERO) == 0 || balance.compareTo(BigDecimal.valueOf(money)) < 0) {
            System.out.println("You want take out " + BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_UP));
            throw new NotEnoughFundsException("Balance is " + balance.setScale(2, RoundingMode.HALF_UP));
        }
        balance = balance.subtract(BigDecimal.valueOf(money));
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "number='" + number + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", ccvCode='" + ccvCode + '\'' +
                ", balance=" + balance.setScale(2, RoundingMode.HALF_UP) +
                '}';
    }
}
