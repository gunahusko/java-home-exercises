package io.codelex.test.exercise2;

public class test2Basket {
    public static void main(String[] args) throws BasketEmptyException, BasketFullException {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();

        Basket<Integer, Apple> basket2 = new Basket<>();

        try {
            basket2.addToBasket(1, apple1);
            basket2.addToBasket(2, apple2);
            basket2.addToBasket(3, apple3);
            basket2.addToBasket(4, apple4);
            basket2.addToBasket(5, apple5);
            basket2.addToBasket(6, apple6);
            basket2.addToBasket(7, apple7);
            basket2.addToBasket(8, apple8);
            basket2.addToBasket(9, apple9);
        } catch (BasketFullException e) {
            System.out.println("A problem occurred: " + e);
        }


        try {
            basket2.removeFromBasket(1);
            basket2.removeFromBasket(2);
            basket2.removeFromBasket(3);
            basket2.removeFromBasket(4);
            basket2.removeFromBasket(5);
            basket2.removeFromBasket(6);
            basket2.removeFromBasket(7);
            basket2.removeFromBasket(8);
            basket2.removeFromBasket(9);
            basket2.removeFromBasket(10);
        } catch (BasketEmptyException e) {
            System.out.println("A problem occurred: " + e);
        }
    }

}
