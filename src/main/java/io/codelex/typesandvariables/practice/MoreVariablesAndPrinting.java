package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        double heightCm;
        double weightKg;

        name = "Zed A. Shaw";
        age = 35;
        heightCm = 74d * 2.54d;  // pounds to cm
        weightKg = 180d * 0.453592d; // lbs to kg
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", heightCm) + " cm tall.");
        System.out.println("He's " + String.format("%.2f", weightKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + String.format("%.2f", heightCm) +
                            " and " + String.format("%.2f", weightKg) + " I get " +
                            (String.format("%.2f", (age + heightCm + weightKg)) + "."));
    }
}