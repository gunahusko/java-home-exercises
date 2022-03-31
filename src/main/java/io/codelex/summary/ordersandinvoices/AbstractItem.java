package io.codelex.summary.ordersandinvoices;

public abstract class AbstractItem implements Item {
    protected String name;
    protected double priceWithoutVat;

    public AbstractItem(String name, double priceWithoutVat) {
        this.name = name;
        this.priceWithoutVat = priceWithoutVat;
    }
}
