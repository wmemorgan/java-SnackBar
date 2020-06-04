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
        System.out.println();

        jane.buySnack(soda.getTotalCost(3));
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println("Quantity of Soda is " + soda.getQuantity());
        System.out.println();

        jane.buySnack(pretzel.getTotalCost(1));
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println("Quantity of Pretzel is " + pretzel.getQuantity());
        System.out.println();

        bob.buySnack(soda.getTotalCost(2));
        System.out.println("Bob cash on hand " + bob.getCash());
        System.out.println("Quantity of Soda is " + soda.getQuantity());
        System.out.println();

        jane.addCash(10.0);
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println();
        
        jane.buySnack(chocolateBar.getTotalCost(1));
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println("Quantity of Chocolate Bar is " + chocolateBar.getQuantity());
        System.out.println();

        pretzel.addQuantity(12);
        System.out.println("Quantity of Pretzel is " + pretzel.getQuantity());
        System.out.println();

        bob.buySnack(pretzel.getTotalCost(3));
        System.out.println("Bob cash on hand " + bob.getCash());
        System.out.println("Quantity of Pretzel is " + pretzel.getQuantity());
        System.out.println();
    }

    public static void main(String[] args) {
        runSnackBar();
    }
}