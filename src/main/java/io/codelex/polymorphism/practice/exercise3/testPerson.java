package io.codelex.polymorphism.practice.exercise3;

public class testPerson {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", "Denison", "2nd Avenue, New York", 12, "advocate");
        Student student = new Student("Mary", "Sunbird", "345 St.Clear street, Boston", 4, 4.0);

        employee.display();
        student.display();
    }
}
