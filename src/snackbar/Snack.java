package snackbar;

import java.math.BigDecimal;

public class Snack {
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // Constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double setCost(double cost) {
        this.cost = cost;
        return cost;
    }

    // Other Methods
    public void addQuantity(int qty) {
        this.quantity += qty;
    }

    public void buySnack(int qty) {
        this.quantity -= qty;
    }

    public BigDecimal getTotalCost(int qty) {
        buySnack(qty);
        BigDecimal bigQuantity = BigDecimal.valueOf(qty);
        BigDecimal bigCost = BigDecimal.valueOf(cost);

        BigDecimal totalCost = bigCost.multiply(bigQuantity);

        return totalCost;
    }

}