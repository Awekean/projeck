package project.model;

import project.model.base.Address;
import project.model.base.Employee;
import project.model.base.Person;
import project.constant.Constant;

public class Teacher extends Person implements Employee {

    private double houseSalary;
    private int workHouse;

    public Teacher(String firstName, String lastName, String gender, int age, Address address) {
        super(firstName, lastName, gender, age, address);
    }

    public double getHouseSalary() {
        return houseSalary;
    }

    public Teacher setHouseSalary(double houseSalary) {
        this.houseSalary = houseSalary;
        return this;
    }

    public int getWorkHouse() {
        return workHouse;
    }

    public Teacher setWorkHouse(int workHouse) {
        this.workHouse = workHouse;
        return this;
    }

    @Override
    public double salary() {

        return houseSalary*workHouse*(1- Constant.FSZN-Constant.NDFL);
    }

    @Override
    public String toString() {
        return "Teacher{}";
    }
}
