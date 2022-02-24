package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        double heightInInches;
        double weightInPounds;

        name = "Zed A. Shaw";
        age = 35;
        heightInInches = 74d;
        weightInPounds = 180d;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        double heightInCm = heightInInches * 2.54d;
        double weightInKg = weightInPounds + 0.453592d;

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f cm tall.\n", heightInCm);
        System.out.printf("He's %.2f kg heavy.\n", weightInKg);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
        System.out.printf(
                "If I add " + age + ", %.2f and %.2f I get %.2f."
                , heightInInches, weightInPounds, (age + heightInInches + weightInPounds)
        );
    }
}