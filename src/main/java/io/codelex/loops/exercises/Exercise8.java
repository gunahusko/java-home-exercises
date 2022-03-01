package io.codelex.loops.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        AsciiFigure(5);
        AsciiFigure(3);
        AsciiFigure(7);
    }

    public static void AsciiFigure(int num) {

        for (int i=1; i<=num; i++) {
            String str = "";
            for (int j=1; j<=(num-i)*4; j++) {
                str += "/";
            }
            for (int k=0; k<((i-1)*8); k++) {
                str += "*";
            }
            for (int l=1; l<=(num-i)*4; l++) {
                str += "\\";
            }
            System.out.println(str);
        }

/*  Variants B:
        String str = "";
        for(int i=1; i<=num; i++) {
            str = "/".repeat((num-i)*4);
            str += "*".repeat((i-1)*8);
            str += "\\".repeat((num-i)*4);
            System.out.println(str);
        }
        System.out.println();
*/
    }
}
