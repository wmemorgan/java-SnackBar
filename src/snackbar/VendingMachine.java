package snackbar;

public class VendingMachine {
    private static int maxId = 0;
    
    private int id;
    private String name;

    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
}