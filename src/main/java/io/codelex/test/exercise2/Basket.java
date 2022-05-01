package io.codelex.test.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> basket;
    private int basketItemCount;

    public Basket() {
        basket = new ArrayList<>();
        basketItemCount = 0;
    }

    @SafeVarargs
    public final void addToBasket(T... items) throws BasketFullException {
        for (T item : items) {
            if (basketItemCount == 10) {
                throw new BasketFullException("Basket is Full!");
            }
            basket.add(item);
            basketItemCount++;
        }
    }

    public void removeFromBasket(int itemIndex) throws BasketEmptyException {
        if (basketItemCount == 0) {
            throw new BasketEmptyException("Basket is Empty!");
        }
        basket.remove(itemIndex);
        basketItemCount--;
    }


}
