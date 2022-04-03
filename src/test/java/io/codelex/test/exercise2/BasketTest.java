package io.codelex.test.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest<T> {

    @Test
    void exceptionAddingMoreThan10Items() {
        String actualResult = "";
        Basket<Mushroom> basketOfMushroom = new Basket<>();
        try {
            basketOfMushroom.addToBasket(new Mushroom("1"), new Mushroom("2"), new Mushroom("3"));
            basketOfMushroom.addToBasket(new Mushroom("4"), new Mushroom("5"), new Mushroom("6"));
            basketOfMushroom.addToBasket(new Mushroom("7"), new Mushroom("8"), new Mushroom("9"));
            basketOfMushroom.addToBasket(new Mushroom("10"), new Mushroom("11"));
        } catch (BasketFullException e) {
            actualResult = "A problem occurred: " + e;
            System.out.println("A problem occurred: " + e);
        }

        String expectedResult = "A problem occurred: io.codelex.test.exercise2.BasketFullException: Basket is Full!";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void exceptionRemovingMoreThanItemsAreInList() {
        String actualResult = "";
        Basket<Apple> basketOfApple = new Basket<>();

        try {
            basketOfApple.addToBasket(new Apple("1"), new Apple("2"), new Apple("3"));
        } catch (BasketFullException e) {
            System.out.println("A problem occurred: " + e);
        }

        try {
            basketOfApple.removeFromBasket(2);
            basketOfApple.removeFromBasket(1);
            basketOfApple.removeFromBasket(0);
            basketOfApple.removeFromBasket(0);
        } catch (BasketEmptyException e) {
            actualResult = "A problem occurred: " + e;
            System.out.println("A problem occurred: " + e);
        }

        String expectedResult = "A problem occurred: io.codelex.test.exercise2.BasketEmptyException: Basket is Empty!";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
