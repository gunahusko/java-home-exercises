package io.codelex.arrays.practice;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        for (int x : myArray) {
            String num = Integer.toString(x);
            char[] digitChar = num.toCharArray();

            Arrays.sort(digitChar);
            if (Integer.parseInt(String.valueOf(digitChar)) == 1245) System.out.println("Contains!");
        }

    }
}
