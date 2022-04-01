package io.codelex.summary.ordersandinvoices;

import java.math.RoundingMode;

public class ElectronicsItem extends AbstractItem{
    private final int powerInWatts;

    public ElectronicsItem(String name, double priceWithoutVat, int powerInWatts) {
        super(name, priceWithoutVat);
        this.powerInWatts = powerInWatts;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + this.getPriceWithoutVat().setScale(2, RoundingMode.HALF_UP) + " EUR, power: " + powerInWatts + "W";
    }
}
