package io.codelex.classesandobjects.exercises;

import java.util.Objects;

public class Dog {
    private final String NAME;
    private final String SEX;
    private final String MOTHER;
    private final String FATHER;

    public Dog(String name, String sex, String mother, String father) {
        this.NAME = name;
        this.SEX = sex;
        this.MOTHER = mother;
        this.FATHER = father;
    }

    public void fathersName() {
        System.out.println(NAME + " father: " + Objects.requireNonNullElse(FATHER, "Unknown"));
    }

    public void mothersName() {
        System.out.println(NAME + " mother: " + Objects.requireNonNullElse(MOTHER, "Unknown"));
    }

    public boolean hasSameMotherAs(Dog otherDog){
        return this.MOTHER.equals(otherDog.MOTHER);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + NAME + '\'' +
                ", sex='" + SEX + '\'' +
                ", mother='" + MOTHER + '\'' +
                ", father='" + FATHER + '\'' +
                '}';
    }
}
