package io.codelex.test.exercise1;

public class DebitCard extends Card {
    public DebitCard(String number, String ownerFullName, String ccvCode, double balance) {
        super(number, ownerFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double money) {
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
        balance = balance + money;

    }

    @Override
    public void takeOutMoney(double money) throws NotEnoughFundsException {
        if (balance == 0) {
            throw new NotEnoughFundsException("Balance is 0.00");
        } else {
            balance = balance - money;
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "number='" + number + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", ccvCode='" + ccvCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
