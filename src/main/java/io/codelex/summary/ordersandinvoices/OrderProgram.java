package io.codelex.summary.ordersandinvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        // Nr.1 order
        FoodItem milk = new FoodItem("Milk", 0.75, LocalDate.of(2022,4,1));
        ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
        HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");

        Order order1 = new Order();
        order1.addItemsToList(milk, radio, bucket);
        Invoice invoice = new Invoice("INV123", order1);
        invoice.formatInvoice();

        // Nr.2 order
        FoodItem pizza = new FoodItem("Pizza", 2.50, LocalDate.of(2022,4,15));
        ElectronicsItem lamp = new ElectronicsItem("Lamp", 8.00, 80);
        HouseholdItem table = new HouseholdItem("Table", 100.00, "natural");

        Order order2 = new Order();
        order2.addItemsToList(pizza, pizza, pizza, lamp, table);
        Invoice invoice2 = new Invoice("INV002", order2);
        invoice2.send();
        invoice2.formatInvoice();

        // empty order
        Order emptyOrder = new Order();
        Invoice invoice3 = new Invoice("INV000", emptyOrder);
        invoice3.formatInvoice();

        // trying to add to order food item with expiration date less than today
        FoodItem bread = new FoodItem("Bread", 1.10, LocalDate.of(2022, 3, 30));
        Order order3 = new Order();
        order3.addItemsToList(bread);

        // order + Item Packing
        ItemPacking itemPacking = new ItemPacking();
        Order order4 = new Order();
        order4.addItemsToList(radio, lamp, table, itemPacking);
        Invoice invoice4 = new Invoice("INV898", order4);
        invoice4.formatInvoice();

    }
}
