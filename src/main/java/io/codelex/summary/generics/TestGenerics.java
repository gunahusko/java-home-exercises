package io.codelex.summary.generics;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestGenerics {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6);

        System.out.println("----------------------------------------------");
        System.out.println("Combiner: ");

        System.out.println(Combiner.combineTwoItems("Mary", 45));

        String combiner = Combiner.combineTwoItems(3, "Leo");
        System.out.println(combiner);

        System.out.println(Combiner.combineTwoItems(BigDecimal.valueOf(34), 5.00));

        System.out.println(Combiner.combineTwoItems(Double.valueOf("6"), numbers));

        System.out.println("----------------------------------------------");
        System.out.println("Printer: ");

        Printer<List<Integer>> printer = new Printer<>(numbers);
        printer.print();
        List<Integer> thingToPrint = printer.getThingToPrint();

        for (Integer things : thingToPrint) {
            System.out.println(things);
        }

        System.out.println("----------------------------------------------");
        System.out.println("StorageHouse: ");

        StorageHouse<String> storageHouse = new StorageHouse<>("Bob");
        storageHouse.addMoreItems("Monica");
        storageHouse.addMoreItems("Jane");

        Optional<String> findFirst = storageHouse.getMaybeFirstItem();
        System.out.println(findFirst);
        System.out.println(findFirst.isPresent());

        storageHouse.printItems();

    }
}
