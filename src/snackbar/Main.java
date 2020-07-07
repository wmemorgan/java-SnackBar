package snackbar;

/**
 * Main
 */
public class Main {

    private static void runSnackBar() {
        System.out.println("Setting up the snack ar");

        // Instantiate customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        System.out.println(c1.getId() + " " + c1.getName());

        // Instantiate vending machines
        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        System.out.println(v1);

        // Instantiate snacks
        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        System.out.println(s1);

    }

    public static void main(String[] args) {
        System.out.println("*** Welcome to Cafe Morgan's Snack Bar ***");
        runSnackBar();
    }
}