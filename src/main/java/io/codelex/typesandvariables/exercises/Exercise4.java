package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write your name:");
        String name = input.nextLine();

        System.out.println("Write a year of birth:");
        int yearOfBirth = input.nextInt();

        System.out.println("My name is " +  name + " and I was born in " + yearOfBirth + "." + " ");
        input.close();
    }

}
