package project.model;

import project.model.base.Address;
import project.model.base.Person;

public class Student extends Person {

    public Student(String firstName, String lastName, String gender, int age, Address address) {
        super(firstName, lastName, gender, age, address);
    }

    public Student(String firstName,String lastName,int age){
        super(firstName,lastName,age);
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
