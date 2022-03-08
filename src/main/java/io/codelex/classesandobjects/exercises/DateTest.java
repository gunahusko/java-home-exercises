package io.codelex.classesandobjects.exercises;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(3, 6, 2022);
        date1.displayDate();

        Date date2 = new Date(12, 12, 2022);
        date2.displayDate();

        Date date3 = new Date(33, 55, 0);
        date3.displayDate();
    }
}
