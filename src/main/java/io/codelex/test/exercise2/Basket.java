package io.codelex.test.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Basket<N, T> {
    private final Map<N, T> basket = new HashMap<>();
    private int basketMaxValue = 0;

    public Basket() {
    }

    public void addToBasket(N key, T item) throws BasketFullException {
        if (basketMaxValue == 10) {
            throw new BasketFullException("Basket is Full!");
        } else {
            basket.put(key, item);
            basketMaxValue++;
        }
    }

    public void removeFromBasket(N key) throws BasketEmptyException {
        if (basketMaxValue == 0) {
            throw new BasketEmptyException("Basket is Emtpty!");
        } else {
            basket.remove(key);
            basketMaxValue--;
        }
    }
}
