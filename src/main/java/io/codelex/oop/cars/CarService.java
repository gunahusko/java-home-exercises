package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carsList = new ArrayList<>();

    public CarService() {
    }

    public void addCar(Car car) {
        carsList.add(car);
    }

    public void removeCar(String name, String model) {
        carsList.removeIf(car -> car.getNAME().equals(name) && car.getMODEL().equals(model));
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
            if (car.getENGINE_TYPE() == EngineType.V12) {
                System.out.println(car);
            }
        }
        System.out.println("_______________________________________");
    }

    public void carsProducedBefore(int year) {
        System.out.println("Cars produced before: " + year);
        for (Car car : carsList) {
            if (car.getYEAR() < year) {
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
        List<Car> sortedCarsByPrice = new ArrayList<>();
        for (Car car : carsList) {
            if (car.getPrice() <= price) {
                sortedCarsByPrice.add(car);
            }
        }
        sortedCarsByPrice.sort((car1, car2) -> {
            int temp = 0;
            if (car1.getPrice() > car2.getPrice()) {
                temp = car1.getPrice();
            }
            return temp;
        });

        for (Car car : sortedCarsByPrice) {
            System.out.println(car);
        }
        System.out.println("_______________________________________");
    }

    public void checkIsCarOnTheList(String name, String model) {
        Car findCar = null;
        for (Car car : carsList) {
            if (car.getNAME().equals(name) && car.getMODEL().equals(model)) {
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
                if (manufacturer.getNAME().equals(manufacturerName)) {
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
                if (manufacturer.getNAME().equals(manufacturerName)) {
                    if (car.getYEAR() == year) {
                        listCarsByYearSameManufacturer.add(car);
                    }
                }
            }
        }
        System.out.println(listCarsByYearSameManufacturer);
        System.out.println("_______________________________________");
    }

}
