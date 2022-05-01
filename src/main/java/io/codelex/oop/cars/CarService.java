package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private final List<Car> carsList = new ArrayList<>();

    public CarService() {
    }

    public void addCar(Car car) {
        carsList.add(car);
    }

    public void removeCar(String name, String model) {
        carsList.removeIf(car -> car.getName().equals(name) && car.getModel().equals(model));
    }

    public void listOfCars() {
        System.out.println("List of all cars:");
        for (Car car : carsList) {
            System.out.println(car);
        }
        System.out.println("_______________________________________");
    }

    public void findCarByEngine(EngineType engineType) {
        System.out.println("Car with a " + engineType + " engine type:");
        for (Car car : carsList) {
            if (car.getEngineType() == engineType) {
                System.out.println(car);
            }
        }
        System.out.println("_______________________________________");
    }

    public void carsProducedBefore(int year) {
        System.out.println("Cars produced before: " + year);
        for (Car car : carsList) {
            if (car.getYear() < year) {
                System.out.println(car);
            }
        }
        System.out.println("_______________________________________");
    }

    public void mostExpensiveCar() {
        System.out.println("Most expensive car:");
        Car expensiveCar = carsList.get(0);
        for (Car car : carsList) {
            if (car.getPrice() > expensiveCar.getPrice()) {
                expensiveCar = car;
            }
        }
        System.out.println(expensiveCar);
        System.out.println("_______________________________________");
    }

    public void cheapestCar() {
        System.out.println("Cheapest car:");
        Car cheapest = carsList.get(0);
        for (Car car : carsList) {
            if (car.getPrice() < cheapest.getPrice()) {
                cheapest = car;
            }
        }
        System.out.println(cheapest);
        System.out.println("_______________________________________");
    }

    public void carWithAtLeastThreeManufacturers() {
        System.out.println("Car with at least three manufacturers:");
        for (Car car : carsList) {
            if (car.getManufacturer().size() >= 3) {
                System.out.println(car);
            }
        }
        System.out.println("_______________________________________");
    }

    public void sortCarsByPrice(int price) {
        System.out.println("Sorted cars from price: " + price);
        List<Car> carsByPrice = new ArrayList<>();
        for (Car car : carsList) {
            if (car.getPrice() <= price) {
                carsByPrice.add(car);
            }
        }

        carsByPrice.sort(Comparator.comparing(Car::getPrice));

        for (Car car : carsByPrice) {
            System.out.println(car);
        }
        System.out.println("_______________________________________");
    }

    public void checkIsCarOnTheList(String name, String model) {
        Car findCar = null;
        for (Car car : carsList) {
            if (car.getName().equals(name) && car.getModel().equals(model)) {
                findCar = car;
                break;
            }
        }
        if ((findCar != null)) {
            System.out.println("Find: " + findCar);
        } else {
            System.out.println("Didn't find: " + name + " " + model);
        }
        System.out.println("_______________________________________");
    }

    public void carsByManufacturer(String manufacturerName) {
        System.out.println("Cars by manufacturer: " + manufacturerName);
        List<Car> listCarsByManufacturer = new ArrayList<>();
        for (Car car : carsList) {
            for (Manufacturer manufacturer : car.getManufacturer()) {
                if (manufacturer.getName().equals(manufacturerName)) {
                    listCarsByManufacturer.add(car);
                }
            }
        }
        for (Car car : listCarsByManufacturer) {
            System.out.println(car);
        }
        System.out.println("_______________________________________");
    }

    public void manufacturerFindYearFrom(String manufacturerName, int year) {
        System.out.println("manufacturer: " + manufacturerName + " ,year: " + year);
        List<Car> listCarsByYearSameManufacturer = new ArrayList<>();
        for (Car car : carsList) {
            for (Manufacturer manufacturer : car.getManufacturer()) {
                if (manufacturer.getName().equals(manufacturerName)) {
                    if (car.getYear() == year) {
                        listCarsByYearSameManufacturer.add(car);
                    }
                }
            }
        }
        System.out.println(listCarsByYearSameManufacturer);
        System.out.println("_______________________________________");
    }

}
