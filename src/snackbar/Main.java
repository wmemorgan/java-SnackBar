package snackbar;

public class Main {
    private static void runSnackBar() {
        System.out.println("Instantiate customers");
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        System.out.println("Instantiate vending machines");
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        System.out.println("Instantiate snacks");
        Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());
        System.out.println();

        c1.buySnack(s4.getTotalCost(3));
        System.out.println(c1.getName() + " cash on hand " + c1.getCash());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
        System.out.println();

        c1.buySnack(s3.getTotalCost(1));
        System.out.println(c1.getName() + " cash on hand " + c1.getCash());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();

        c2.buySnack(s4.getTotalCost(2));
        System.out.println(c2.getName() + " cash on hand " + c2.getCash());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
        System.out.println();

        c1.addCash(10.0);
        System.out.println(c1.getName() + " cash on hand " + c1.getCash());
        System.out.println();
        
        c1.buySnack(s2.getTotalCost(1));
        System.out.println(c1.getName() + " cash on hand " + c1.getCash());
        System.out.println("Quantity of Chocolate Bar is " + s2.getQuantity());
        System.out.println();

        s3.addQuantity(12);
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();

        c2.buySnack(s3.getTotalCost(3));
        System.out.println(c2.getName() + " cash on hand " + c2.getCash());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();
    }

    public static void main(String[] args) {
        runSnackBar();
    }
}