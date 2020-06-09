package snackbar;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cashOnHand;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void addCash(double cash) {
        this.cashOnHand += cash;
    }

    public void buySnack(double cost) {
        this.cashOnHand -= cost;
    } 
}