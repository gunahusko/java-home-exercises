package io.codelex.summary.ordersandinvoices;

import java.math.BigDecimal;

public interface SellableThing {
    String getName();
    BigDecimal getPriceWithoutVat();
    String getFullInfo();
}
