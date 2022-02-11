package project.model.base;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, String gender, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age =  age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Person setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}


