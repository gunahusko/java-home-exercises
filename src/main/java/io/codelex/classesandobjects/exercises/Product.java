package io.codelex.classesandobjects.exercises;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        //System.out.printf("%s, %.2f EUR, %d units\n", name, priceAtStart, amountAtStart);
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStart);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceAtStart=" + priceAtStart +
                ", amountAtStart=" + amountAtStart +
                '}';
    }
}
