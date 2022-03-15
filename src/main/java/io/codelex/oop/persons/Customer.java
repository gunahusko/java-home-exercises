package io.codelex.oop.persons;

public class Customer extends Person{
    private final String CUSTOMER_ID;
    public int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.CUSTOMER_ID = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + CUSTOMER_ID + " (" + purchaseCount + " purchases)";
    }
}
