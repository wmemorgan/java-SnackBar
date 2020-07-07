package snackbar;

public class VendingMachine {
    // Fields
    private static int maxId = 0;

    private int id;
    private String name;

    // Constructor
    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vending Machine" + " " +
                "Id: " + id + " " +
                "Name: " + name; 
    }
}