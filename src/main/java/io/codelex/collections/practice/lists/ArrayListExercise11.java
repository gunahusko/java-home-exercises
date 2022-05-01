package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("six");
        arrayList.add("seven");
        arrayList.add("eight");
        arrayList.add("nine");
        arrayList.add("ten");
        System.out.printf("%-47s %s\n", "ArrayList before change: ", arrayList);

        arrayList.add(4, "zero");
        System.out.printf("%-47s %s\n", "ArrayList after new value at 5th position: ", arrayList);

        arrayList.set(arrayList.size()-1, "twenty");
        System.out.printf("%-47s %s\n", "ArrayList after change value at last position: ", arrayList);

        Collections.sort(arrayList);
        System.out.printf("%-47s %s\n\n", "Sorted arrayList in alphabetical order: ", arrayList);

        if (arrayList.contains("Foobar")) {
            System.out.println("Found the element\n");
        } else {
            System.out.println("There is no such element\n");
        }

        for (String element : arrayList) {
            System.out.println(element);
        }
    }

}
