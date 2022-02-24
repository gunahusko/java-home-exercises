package io.codelex.typesandvariables.exercises;

public class Exercise5 {
    public static void main(String[] args) {

        String[] nameOfClass = {
                "English III",
                "Precalculus",
                "Music Theory",
                "Biotechnology",
                "Principles of Technology I",
                "Latin II",
                "AP US History",
                "Business Computer Information Systems"
        };

        String[] teacherOfClass = {
                "Ms. Lapan",
                "Mrs. Gideon",
                "Mr. Davis",
                "Ms. Palmer",
                "Ms. Garcia",
                "Mrs. Barnett",
                "Ms. Johannessen",
                "Mr. James"
        };

        System.out.println("+-------------------------------------------------------------+");
        for (int i=0; i<8; i++) {
            System.out.printf("| %s | %37s | %15s |\n", i+1, nameOfClass[i], teacherOfClass[i]);
        }
        System.out.println("+-------------------------------------------------------------+");
    }
}
