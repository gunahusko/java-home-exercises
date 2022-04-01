package io.codelex.test.exercise1;

public class CreditCard extends Card {

    public CreditCard(String number, String ownerFullName, String ccvCode, double balance) {
        super(number, ownerFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double money) {
        balance = balance + money;
    }

    @Override
    public void takeOutMoney(double money) throws NotEnoughFundsException {
        if (balance < 100 && balance > 0) {
            System.out.println("Warning: Low funds");
            balance = balance - money;
        } else if (balance == 0) {
            throw new NotEnoughFundsException("Balance is 0.00");
        } else {
            balance = balance - money;
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", ccvCode='" + ccvCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
