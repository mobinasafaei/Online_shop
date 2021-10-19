package model;

import enums.CartStatus;

public class Cart {
    private int id;
    private double totalCost;
    private CartStatus cartStatus;
    private int customerId;

    public Cart(int id, double totalCost, CartStatus cartStatus, int customerId) {
        this.id = id;
        this.totalCost = totalCost;
        this.cartStatus = cartStatus;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public CartStatus getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(CartStatus cartStatus) {
        this.cartStatus = cartStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
