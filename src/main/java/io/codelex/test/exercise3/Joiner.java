package io.codelex.test.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final String join(T... type) {
        List<String> listOfTypes = new ArrayList<>();

        for (T element : type) {
            String str = String.valueOf(element);
            listOfTypes.add(str);
        }

        return String.join(separator, listOfTypes);
    }
}
