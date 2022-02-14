package project.model.base;

public class Address {

    private String cite;
    private String street;
    private int numberHouse;
    private int numberApartment;

    public Address(String cite, String street, int numberHouse, int numberApartment) {
        this.cite = cite;
        this.street = street;
        this.numberHouse = numberHouse;
        this.numberApartment = numberApartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cite='" + cite + '\'' +
                ", street='" + street + '\'' +
                ", numberHouse=" + numberHouse +
                ", numberApartment=" + numberApartment +
                '}';
    }
}
