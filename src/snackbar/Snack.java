package snackbar;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double setCost(double cost) {
        this.cost = cost;
        return cost;
    }

    public void addQuantity(int qty) {
        this.quantity += qty;
    }

    public void buySnack(int qty) {
        this.quantity -= qty;
    }

    public double getTotalCost(int qty) {
        buySnack(qty);

        double totalCost = Math.round((cost * qty) * 100.0) / 100.0;

        return totalCost;
    }

}