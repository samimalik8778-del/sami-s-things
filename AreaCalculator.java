import java.util.Scanner;

public class AreaCalculator {

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double areaSquare(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== Area Calculator ====");
            System.out.println("1) Circle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area of Circle: " + area(r));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + area(l, w));
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    System.out.println("Area of Square: " + areaSquare(s));
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}

