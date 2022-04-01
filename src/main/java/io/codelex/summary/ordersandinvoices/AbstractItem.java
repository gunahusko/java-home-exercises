package io.codelex.summary.ordersandinvoices;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {
    protected String name;
    protected double priceWithoutVat;

    public AbstractItem(String name, double priceWithoutVat) {
        this.name = name;
        this.priceWithoutVat = priceWithoutVat;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPriceWithoutVat() {
        return new BigDecimal(priceWithoutVat);
    }

}
