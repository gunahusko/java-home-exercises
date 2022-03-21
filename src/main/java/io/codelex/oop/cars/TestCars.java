package io.codelex.oop.cars;

public class TestCars {
    public static void main(String[] args) {
        Manufacturer volkswagen = new Manufacturer("Volkswagen Group", 1937, "Germany");
        System.out.println(volkswagen);

        Car audi = new Car("Audi", "A4", 39_100, 2022, EngineType.S4, volkswagen);
        System.out.println(audi);


    }
}
