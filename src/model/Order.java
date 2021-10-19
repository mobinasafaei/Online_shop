package model;

public class Order {
    private int id;
    private String orderType;
    private String orderName;
    private double cost;
    private int count;
    private int customerId;

    public Order(int id, String orderType, String orderName, double cost, int count, int customerId) {
        this.id = id;
        this.orderType = orderType;
        this.orderName = orderName;
        this.cost = cost;
        this.count = count;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
