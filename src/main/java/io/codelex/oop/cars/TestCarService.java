package io.codelex.oop.cars;

public class TestCarService {
    public static void main(String[] args) {
        CarService autoService = new CarService();

        // 1. adding cars to the list
        autoService.addCar(new Car("Audi", "A4", 39_100, 2022, EngineType.S4, new Manufacturer("Volkswagen Group", 1937, "Germany")));
        autoService.addCar(new Car("Aston Martin", "V12 Vantage S", 160_000, 2018, EngineType.V12, new Manufacturer("Aston Martin Lagonda", 1913, "England")));
        autoService.addCar(new Car("Ford", "B-Max", 10_500, 2015, EngineType.S4, new Manufacturer("Ford Motor Company", 1903, "USA")));
        autoService.addCar(new Car("BMW", "118", 3700, 2005, EngineType.S6, new Manufacturer("BMW Group", 1916, "Germany")));
        autoService.addCar(new Car("Toyoda", "A1", 3350, 1936, EngineType.V2, new Manufacturer("Toyoda Automatic Loom Works", 1926, "Japan")));
        autoService.addCar(new Car("Volkswagen", "Type 1", 990, 1937, EngineType.V2, new Manufacturer("Volkswagen", 1937, "Germany")));
        autoService.addCar(new Car("Volkswagen", "ID.3", 33030, 2021, EngineType.MAGNET_AC, new Manufacturer("Volkswagen Group", 1937, "Germany")));

        Car carVaz = new Car("Жигули", "ВАЗ-2101", 500, 1970, EngineType.V2, new Manufacturer("Volga Automobile Factory", 1966, "Russia"));
        carVaz.addManufacturer(new Manufacturer("Made by Dad"));
        carVaz.addManufacturer(new Manufacturer("Neighborhood association"));
        autoService.addCar(carVaz);

        // 2. removing a car from the list
        autoService.removeCar("Ford", "B-Max");

        // 3. returning a list of all cars
        autoService.listOfCars();

        // 4. returning cars with a V12 engine
        autoService.findCarByEngine(EngineType.V12);

        // 5. returning cars produced before 1999
        autoService.carsProducedBefore(1999);

        // 6. returning the most expensive car
        autoService.mostExpensiveCar();

        // 7. returning the cheapest car
        autoService.cheapestCar();

        // 8. returning the car with at least 3 manufacturers
        autoService.carWithAtLeastThreeManufacturers();

        // 9. returning a list of all cars sorted according to the passed parameter: ascending / descending
        autoService.sortCarsByPrice(4000);

        // 10. checking if a specific car is on the list
        autoService.checkIsCarOnTheList("BMW", "118");

        // 11. returning a list of cars manufactured by a specific manufacturer
        autoService.carsByManufacturer("Volkswagen Group");

        // 12. returning the list of cars manufactured by the manufacturer with the year of establishment
        autoService.manufacturerFindYearFrom("Volkswagen Group", 2000);

    }
}
