package project.model;

import project.base.Address;
import project.base.Person;

public class Student extends Person {
    public Student(String firstName, String lastName, String gender, int age, Address address) {
        super(firstName, lastName, gender, age, address);
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
