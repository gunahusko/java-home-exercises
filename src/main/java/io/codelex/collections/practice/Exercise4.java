package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    static Set<String> listOfNames = new HashSet<>();

    public static void main(String[] args) {
        userAnswer();
    }

    private static void userAnswer() {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter name: ");
        String answer = user.nextLine();

        if (answer.length() > 0) {
            listOfNames.add(answer);
            userAnswer();
        } else {
            System.out.print("Unique name list contains: ");

            for (String element : listOfNames) {
                System.out.print(element + " ");
            }
            user.close();
        }
    }
}
