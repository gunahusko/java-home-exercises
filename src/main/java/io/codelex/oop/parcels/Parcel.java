package io.codelex.oop.parcels;

public class Parcel implements Validatable{
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {

        try {
            if ((xLength + yLength + zLength) <= 300 && xLength >= 30 && yLength >= 30 && zLength >= 30) {
                isExpress = !(weight < 30.0) || !(weight > 15.0);
            }
        } catch (Exception e) {
            System.out.println("Notika, kas neparedzēts: " + e);
        }

        return isExpress;

    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLength=" + xLength +
                ", yLength=" + yLength +
                ", zLength=" + zLength +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }
}
