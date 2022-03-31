package io.codelex.summary.ordersandinvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    protected final List<Object> itemList = new ArrayList<>();

    public Order() {
    }

    public void addItemsToList(Object... items) {
        for (Object item : items) {
            if (item instanceof FoodItem) {
                try {
                    if (((FoodItem) item).getDateOfExpiration().isBefore(LocalDate.now())) {
                        throw new BadFoodException("The food has expired!");
                    } else {
                        itemList.add(item);
                    }
                } catch (BadFoodException e) {
                    System.out.println("A problem occurred: " + e);
                }
            } else {
                itemList.add(item);
            }
        }
    }

    public List<Object> getItemList() {
        return itemList;
    }
}
