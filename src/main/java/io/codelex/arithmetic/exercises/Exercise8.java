package io.codelex.arithmetic.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        hourlyPay(35, 7.50);
        hourlyPay(47, 8.20);
        hourlyPay(73, 10.00);
        hourlyPay(40, 8.00);
        hourlyPay(50, 8.00);
    }

    public static void hourlyPay(int workedHours, double basePay) {
        if (workedHours > 60 || basePay < 8.00) {
            System.out.println("An error message.");
        } else {
            double totalPay = 0.00;

            if (workedHours > 40) {
                int overtime = workedHours - 40;
                totalPay += (40 * basePay) + overtime * (basePay * 1.50d);
            } else {
                totalPay += workedHours * basePay;
            }

            System.out.printf("Total pay $%.2f\n", totalPay);
        }
    }
}
