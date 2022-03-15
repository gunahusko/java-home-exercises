package io.codelex.oop.persons;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Peter", "Brown", "1", 18, "CID1234", 10);
        System.out.println(customer1.getInfo());

        Employee employee1 = new Employee("John", "Brown", "2", 28, "Accountant", LocalDate.of(2000, 3, 5));
        System.out.println(employee1.getInfo());
    }

}
