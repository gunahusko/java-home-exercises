package io.codelex.arithmetic.exercises;

public class Exercise9 {
    public static void main(String[] args) {
        bodyMassIndexCalculator(80.50, 1.86);
        bodyMassIndexCalculator(80.00, 1.58);
        bodyMassIndexCalculator(60.00, 1.86);
    }

    public static void bodyMassIndexCalculator(double weightInKg, double heightInMeters) {
        double weightInPounds = weightInKg / 0.45359237;
        double heightInInches = heightInMeters / 0.0254;
        double bmi = weightInPounds * 703 / Math.pow(heightInInches, 2);

        if (bmi < 18.50) {
            System.out.println("The person is considered underweight.");
        } else if (bmi >= 18.50 && bmi <= 25) {
            System.out.println("The person is optimal overweight.");
        } else if (bmi > 25) {
            System.out.println("The person is considered overweight.");
        }
    }
}
