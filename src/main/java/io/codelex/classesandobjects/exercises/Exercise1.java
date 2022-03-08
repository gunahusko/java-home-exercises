package io.codelex.classesandobjects.exercises;

public class Exercise1 {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00d, 14);
        Product phone = new Product("iPhone 5s", 999.99d, 3);
        Product projector = new Product("Epson EB-U05", 440.46d, 1);

        System.out.println(mouse);
        System.out.println(phone);
        System.out.println(projector);
        System.out.println();

        mouse.printProduct();
        phone.printProduct();
        projector.printProduct();

        System.out.println();
        mouse.setName("Logitech mouse NEW");
        mouse.setPriceAtStart(10.50d);
        mouse.setAmountAtStart(50);

        mouse.printProduct();
    }
}
