package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        System.out.printf("%-10s %s\n", "Array:", Arrays.toString(array));

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.printf("%-10s %s\n", "ArrayList:", arrayList);

        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(array));
        System.out.printf("%-10s %s\n", "HashSet:", hashSet);

        HashMap<String, String> hashMap = new HashMap<>();
        String[] arrayOrigination = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], arrayOrigination[i]);
        }

        System.out.printf("%-10s %s\n", "HashMap:", hashMap);
    }
}
