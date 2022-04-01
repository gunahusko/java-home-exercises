package io.codelex.summary.ordersandinvoices;

import java.math.RoundingMode;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, double priceWithoutVat, String color) {
        super(name, priceWithoutVat);
        this.color = color;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + this.getPriceWithoutVat().setScale(2, RoundingMode.HALF_UP) + " EUR, color: " + color;
    }
}
