package io.codelex.test.exercise2;

public class test2Basket {
    public static void main(String[] args) throws BasketEmptyException, BasketFullException {

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
            System.out.println("A problem occurred: " + e);
        }
    }

}
