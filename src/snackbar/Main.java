package snackbar;

/**
 * Main
 */
public class Main {

    private static void runSnackBar() {
        System.out.println("\nSetting up the snack bar\n");

        // Instantiate customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // Instantiate vending machines
        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        // Instantiate snacks
        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        c1.buySnack(s4.getTotalCost(3));
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        s4.buySnack(3);
        System.out.println("Quanity of " + s4.getName() + " is " + s4.getQuantity());
        System.out.println();

        c1.buySnack(s3.getTotalCost(1));
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        s3.buySnack(1);
        System.out.println("Quanity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();

        c2.buySnack(s4.getTotalCost(2));
        System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
        s4.buySnack(2);
        System.out.println("Quanity of " + s4.getName() + " is " + s4.getQuantity());
        System.out.println();

        c1.addCash(10);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println();

        c1.buySnack(s2.getTotalCost(1));
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        s2.buySnack(1);
        System.out.println("Quanity of " + s2.getName() + " is " + s2.getQuantity());
        System.out.println();

        s3.addQuantity(12);
        System.out.println("Quanity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();

        c2.buySnack(s3.getTotalCost(3));
        System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
        s3.buySnack(3);
        System.out.println("Quanity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();


    }

    public static void main(String[] args) {
        System.out.println("*** Welcome to Cafe Morgan's Snack Bar ***");
        runSnackBar();
    }
}