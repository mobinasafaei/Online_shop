package model;

import java.util.List;

public class Customer {
    private int id;
    private String subscriptionNumber;
    private String firstName;
    private String lastName;
    private String address;
    private List<Order> orders;

    public Customer(int id, String subscriptionNumber, String firstName, String lastName, String address, List<Order> orders) {
        this.id = id;
        this.subscriptionNumber = subscriptionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    public void setSubscriptionNumber(String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
