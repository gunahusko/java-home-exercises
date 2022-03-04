package io.codelex.arrays.exercises;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];

        for(int i=0; i<10; i++) {
            array1[i] = (int) (Math.random() * 100) + 1;
        }

        int[] array2 = array1.clone();
        array1[9] = -7;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
