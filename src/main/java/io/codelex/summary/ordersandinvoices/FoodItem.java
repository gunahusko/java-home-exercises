package io.codelex.summary.ordersandinvoices;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {
    private final LocalDate dateOfExpiration;

    public FoodItem(String name, double priceWithoutVat, LocalDate dateOfExpiration) {
        super(name, priceWithoutVat);
        this.dateOfExpiration = dateOfExpiration;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPriceWithoutVat() {
        return new BigDecimal(priceWithoutVat);
    }

    @Override
    public String getFullInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return name + ", " + this.getPriceWithoutVat().setScale(2, RoundingMode.HALF_UP) + " EUR, best before: " + formatter.format(dateOfExpiration);
    }
}
