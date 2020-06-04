package snackbar;

public class Main {
    private static void runSnackBar() {
        System.out.println("Instantiate customers");
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        System.out.println("Instantiate vending machines");
        VendingMachine foodVendingMachine = new VendingMachine("Food");
        VendingMachine drinkVendingMachine = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        System.out.println("Instantiate snacks");
        Snack chips = new Snack("Chips", 36, 1.75, foodVendingMachine.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, foodVendingMachine.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, foodVendingMachine.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drinkVendingMachine.getId());
        Snack water = new Snack("Water", 20, 2.75, drinkVendingMachine.getId());

        System.out.println("Product ID: " + chips.getId() + " Chips quantity: " + chips.getQuantity());
        System.out.println("Bought 10 at a cost of " + chips.getTotalCost(10));
        System.out.println("Remaining quantity: " + chips.getQuantity());
        
        System.out.println();
        System.out.println("Product ID: " + chocolateBar.getId() + " Chips quantity: " + chocolateBar.getQuantity());
        System.out.println("Bought 30 at a cost of " + chocolateBar.getTotalCost(30));
        System.out.println("Add 4 bars to the stock");
        chocolateBar.addQuantity(4);
        System.out.println("Remaining quantity: " + chocolateBar.getQuantity());

        System.out.println();
        System.out.println("Update pretzel name to: " + pretzel.setName("Fresh Pretzel"));
        System.out.println("Product ID: " + pretzel.getId() + " pretzel quantity: " + pretzel.getQuantity());
        System.out.println("Bought 2 at a cost of " + pretzel.getTotalCost(2));
        System.out.println("Add 100 pretzels to the stock");
        pretzel.addQuantity(100);
        System.out.println("Current quantity: " + pretzel.getQuantity());
        System.out.println("Reduce price to 1.75");
        pretzel.setCost(1.75);
        System.out.println("Bought 2 more at a cost of " + pretzel.getTotalCost(2));
        System.out.println("Remaining quantity: " + pretzel.getQuantity());

    }

    public static void main(String[] args) {
        runSnackBar();
    }
}