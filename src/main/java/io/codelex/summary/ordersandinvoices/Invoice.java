package io.codelex.summary.ordersandinvoices;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private final List<Object> listOfItems = new ArrayList<>();
    private final String invoiceNumber;
    private String invoiceStatus = String.valueOf(InvoiceStatus.APPROVED);
    private BigDecimal totalPriceWithoutVat = new BigDecimal(0).setScale(2, RoundingMode.HALF_UP);
    private final BigDecimal vat = new BigDecimal("0.21");

    public Invoice(String invoiceNumber, Order order) {
        this.invoiceNumber = invoiceNumber;

        try {
            if (order.getItemList().isEmpty()) {
                throw new WrongOrderException("The order is empty!");
            } else {
                listOfItems.addAll(order.getItemList());
            }
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    public void send() {
        invoiceStatus = String.valueOf(InvoiceStatus.SENT);
    }

    public void formatInvoice() {
        System.out.printf("%-60s\n", "=".repeat(60));
        System.out.printf("= %-56s =\n", "INVOICE NUMBER: " + invoiceNumber);
        System.out.printf("= %-56s =\n", "STATUS: " + invoiceStatus);

        printItems();

        BigDecimal totalVat = totalPriceWithoutVat.multiply(vat).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalPriceWithVat = totalPriceWithoutVat.add(totalVat).setScale(2, RoundingMode.HALF_UP);

        System.out.printf("= %-56s =\n", "SUM: " + totalPriceWithoutVat + " EUR");
        System.out.printf("= %-56s =\n", "VAT (21%): " + totalVat + " EUR");
        System.out.printf("= %-56s =\n", "TOTAL: " + totalPriceWithVat + " EUR");
        System.out.printf("%-60s\n", "=".repeat(60));
    }

    public void printItems() {
        for (int i = 0; i < listOfItems.size(); i++) {
            Object tempItem = listOfItems.get(i);

            if (tempItem instanceof FoodItem) {
                System.out.printf("= %d. %-53s =\n", i + 1, ((FoodItem) tempItem).getFullInfo());
                totalPriceWithoutVat = totalPriceWithoutVat.add(((FoodItem) tempItem).getPriceWithoutVat());
            }
            if (tempItem instanceof ElectronicsItem) {
                System.out.printf("= %d. %-53s =\n", i + 1, ((ElectronicsItem) tempItem).getFullInfo());
                totalPriceWithoutVat = totalPriceWithoutVat.add(((ElectronicsItem) tempItem).getPriceWithoutVat());
            }
            if (tempItem instanceof HouseholdItem) {
                System.out.printf("= %d. %-53s =\n", i + 1, ((HouseholdItem) tempItem).getFullInfo());
                totalPriceWithoutVat = totalPriceWithoutVat.add(((HouseholdItem) tempItem).getPriceWithoutVat());
            }
            if (tempItem instanceof ItemPacking) {
                System.out.printf("= %d. %-53s =\n", i + 1, ((ItemPacking) tempItem).getFullInfo());
                totalPriceWithoutVat = totalPriceWithoutVat.add(((ItemPacking) tempItem).getPriceWithoutVat());
            }
        }
    }

}
