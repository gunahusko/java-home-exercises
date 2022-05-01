package io.codelex.test.exercise2;

public class testBasket {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {

        Basket<Mushroom> basketOfMushroom = new Basket<>();

        try {
            basketOfMushroom.addToBasket(new Mushroom("1"), new Mushroom("2"), new Mushroom("3"));
            basketOfMushroom.addToBasket(new Mushroom("4"), new Mushroom("5"), new Mushroom("6"));
            basketOfMushroom.addToBasket(new Mushroom("7"), new Mushroom("8"), new Mushroom("9"));
            basketOfMushroom.addToBasket(new Mushroom("10"), new Mushroom("11"));
        } catch (BasketFullException e) {
            System.out.println("A problem occurred: " + e);
        }
    }
}

