package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    protected final String processor;
    protected final String ram;
    protected final String graphicsCard;
    protected final String company;
    protected final String model;

    public Computer(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Computer)) {
            return false;
        }
        Computer computer = (Computer) o;
        return getProcessor().equals(computer.getProcessor()) && getRam().equals(computer.getRam()) && getGraphicsCard().equals(computer.getGraphicsCard()) && getCompany().equals(computer.getCompany()) && getModel().equals(computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessor(), getRam(), getGraphicsCard(), getCompany(), getModel());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
