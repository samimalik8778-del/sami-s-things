import java.util.Scanner;

public class PizzaBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = 0;

        System.out.print("Enter pizza size (small/medium/large): ");
        String size = sc.nextLine().toLowerCase();

        switch (size) {
            case "small":
                bill = 100;
                break;
            case "medium":
                bill = 200;
                break;
            case "large":
                bill = 300;
                break;
            default:
                System.out.println("Invalid size!");
                return;
        }

        System.out.print("Do you want pepperoni? (yes/no): ");
        String pepperoni = sc.nextLine().toLowerCase();
        if (pepperoni.equals("yes")) {
            if (size.equals("small")) bill += 30;
            else bill += 50;
        }

        System.out.print("Do you want extra cheese? (yes/no): ");
        String cheese = sc.nextLine().toLowerCase();
        if (cheese.equals("yes")) bill += 20;

        System.out.println("\nYour final bill is: " + bill + " rupees");
        sc.close();
    }
}

