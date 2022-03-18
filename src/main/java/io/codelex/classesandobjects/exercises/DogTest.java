package io.codelex.classesandobjects.exercises;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female", "Molly", "Buster");

        coco.fathersName();
        sparky.fathersName();
        System.out.println("Does Coco has same mother as Rocky? " + coco.hasSameMotherAs(rocky));
        System.out.println("Does Max has same mother as Rocky? " + max.hasSameMotherAs(rocky));
        System.out.println("Does Sparky has same mother as Molly? " + sparky.hasSameMotherAs(molly));

        buster.mothersName();
        sam.mothersName();
        lady.mothersName();
        molly.mothersName();
    }
}
