package io.codelex.classesandobjects.exercises;

import java.util.Objects;

public class Dog {
    private final String name;
    private final String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void fathersName() {
        System.out.println(name + " father: " + Objects.requireNonNullElse(father, "Unknown"));
    }

    public void mothersName() {
        System.out.println(name + " mother: " + Objects.requireNonNullElse(mother, "Unknown"));
    }

    public String hasSameMotherAs(Dog otherDog){
        if (mother == null || otherDog.mother == null) {
            return "Unknown";
        } else if (mother.equals(otherDog.mother)){
            return "Yes";
        } else {
            return "No";
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}
