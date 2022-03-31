package io.codelex.summary.lazybox;

import java.util.Objects;

public class LazyBoxProgram {
    public static void main(String[] args) {

//        LazyBox<Integer> box = new LazyBox<>(LazyBoxProgram::doLargeCalculation);
//        printOutBoxContents(box);
//
//        Integer result = 0;
//        for (int i = 0; i < 10000; i++) {
//            result = box.get();
//        }
//        System.out.println(result);

        LazyBox<Integer> box = new LazyBox<>(LazyBoxProgram::doLargeCalculation);
        LazyBox<String> textBox = box.map(Objects::toString);
        LazyBox<String> upperTextBox = textBox.map(String::toUpperCase);
        LazyBox<String> fullTextBox = textBox.map((String s) -> "Result is " + s);

        String result2 = upperTextBox.get();
        System.out.println(result2);
    }

    public static Integer doLargeCalculation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return 153;
    }
    private static <A> void printOutBoxContents(LazyBox<A> box) {
        System.out.println(box.get());
    }

}
