package io.codelex.classesandobjects.exercises;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male", null, null);
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male", null, null);
        Dog lady = new Dog("Lady", "female", null, null);
        Dog molly = new Dog("Molly", "female",null, null);
        Dog coco = new Dog("Coco", "female", "Molly", "Buster");

        coco.fathersName();
        sparky.fathersName();
        System.out.println("Does Coco has same mother as Rocky? " + coco.hasSameMotherAs(rocky));
        System.out.println("Does Max has same mother as Rocky? " + max.hasSameMotherAs(rocky));

        buster.mothersName();
        sam.mothersName();
        lady.mothersName();
        molly.mothersName();
    }
}
