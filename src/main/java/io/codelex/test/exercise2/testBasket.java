package io.codelex.test.exercise2;

public class testBasket {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {
        Mushroom mushroom1 = new Mushroom();
        Mushroom mushroom2 = new Mushroom();
        Mushroom mushroom3 = new Mushroom();
        Mushroom mushroom4 = new Mushroom();
        Mushroom mushroom5 = new Mushroom();
        Mushroom mushroom6 = new Mushroom();
        Mushroom mushroom7 = new Mushroom();
        Mushroom mushroom8 = new Mushroom();
        Mushroom mushroom9 = new Mushroom();
        Mushroom mushroom10 = new Mushroom();
        Mushroom mushroom11 = new Mushroom();

        Basket<Integer, Mushroom> basket1 = new Basket<>();
        try {
            basket1.addToBasket(1, mushroom1);
            basket1.addToBasket(2, mushroom2);
            basket1.addToBasket(3, mushroom3);
            basket1.addToBasket(4, mushroom4);
            basket1.addToBasket(5, mushroom5);
            basket1.addToBasket(6, mushroom6);
            basket1.addToBasket(7, mushroom7);
            basket1.addToBasket(8, mushroom8);
            basket1.addToBasket(9, mushroom9);
            basket1.addToBasket(10, mushroom10);
            basket1.addToBasket(11, mushroom11);
        } catch (BasketFullException e) {
            System.out.println("A problem occurred: " + e);
        }
    }
}

