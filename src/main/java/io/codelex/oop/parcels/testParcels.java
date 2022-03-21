package io.codelex.oop.parcels;

public class testParcels {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(20, 30, 20, 15);
        parcel1.validate();
        System.out.println(parcel1);

        Parcel parcel2 = new Parcel(30, 30, 30, 25);
        parcel2.validate();
        System.out.println(parcel2);

        Parcel parcel3 = new Parcel(35, 35, 35, 10);
        parcel3.validate();
        System.out.println(parcel3);

        Parcel parcel4 = new Parcel(100, 120, 100, 2);
        parcel4.validate();
        System.out.println(parcel4);

    }
}
