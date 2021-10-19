package model;

import enums.ProductType;

public class Product {
    private int id;
    private ProductType type;
    private String name;
    private double cost;
    private int stock;

    public Product(int id,ProductType type, String name, double cost, int stock) {
        this.id = id;
        this.type =type;
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
