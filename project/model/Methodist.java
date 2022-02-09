package project.model;

import project.base.Address;
import project.base.Employee;
import project.base.Person;
import project.constant.Constant;

import java.util.List;

public class Methodist extends Person implements Employee {

    private List<Teacher> teacherList;
    private double houseSalary;
    private int workHouse;

    public Methodist(String firstName, String lastName, String gender, int age, Address address) {
        super(firstName, lastName, gender, age, address);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public double salary() {
        return houseSalary*workHouse*(1- Constant.FSZN-Constant.NDFL);
    }

    @Override
    public String toString() {
        return "Methodist{}";
    }
}
