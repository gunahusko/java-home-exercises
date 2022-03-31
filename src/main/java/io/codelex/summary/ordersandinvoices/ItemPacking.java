package io.codelex.summary.ordersandinvoices;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final BigDecimal PRICE = new BigDecimal("5.00");

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPriceWithoutVat() {
        return PRICE;
    }

    @Override
    public String getFullInfo() {
        return NAME + ", " + this.getPriceWithoutVat() + " EUR";
    }
}
