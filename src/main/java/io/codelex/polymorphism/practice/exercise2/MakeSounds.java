package io.codelex.polymorphism.practice.exercise2;

import java.util.Arrays;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework firework1 = new Firework();
        Firework firework2 = new Firework();
        Firework firework3 = new Firework();
        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();
        Parrot parrot3 = new Parrot();
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();

        List<Object> soundList = Arrays.asList(firework1, firework2, firework3, parrot1, parrot2, parrot3, radio1, radio2);

        for (Object sounds : soundList) {
        }
        
    }
}
