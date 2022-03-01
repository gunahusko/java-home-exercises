package io.codelex.loops.practice;

public class Vowels {

    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};


        // example A
//        System.out.println("Example: use for");
//        for (int i=0; i<vowels.length; i++) {
//            System.out.println(vowels[i]);
//        }

        // example B
        System.out.println("Example: use foreach");
        for (char abc : vowels) {
            System.out.println(abc);
        }
    }

}
