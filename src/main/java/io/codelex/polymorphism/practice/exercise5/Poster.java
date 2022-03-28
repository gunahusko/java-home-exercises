package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final String dimensions;
    private final int numberOfCopies;
    private final int costPerCopy;

    public Poster(int fee, String dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + numberOfCopies * costPerCopy;
    }


    public String toString() {
        return super.toString() + " Dimensions=" + dimensions + " Number of copies=" + numberOfCopies + " Cost per copy=" + costPerCopy;
    }
}
