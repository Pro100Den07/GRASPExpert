package org.example;
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " + zipCode;
    }
}

class User {
    private String name;
    private String email;
    private Address address;

    public User(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address("123 Main St", "Kyiv", "Kyiv", "01001");
        User user = new User("Den", "@gmail.com", myAddress);
        user.displayInfo();
    }
}