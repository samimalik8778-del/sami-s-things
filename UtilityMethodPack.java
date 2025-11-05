import java.util.Scanner;

public class UtilityMethodPack {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static long multiply(int a, int b) {
        return (long) a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static int maxofThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== Utility Method Pack ====");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Max of Three");
            System.out.println("6) Check Prime");
            System.out.println("7) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a1 = sc.nextInt(), b1 = sc.nextInt();
                    System.out.println("Result: " + add(a1, b1));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    int a2 = sc.nextInt(), b2 = sc.nextInt();
                    System.out.println("Result: " + subtract(a2, b2));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    int a3 = sc.nextInt(), b3 = sc.nextInt();
                    System.out.println("Result: " + multiply(a3, b3));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    int a4 = sc.nextInt(), b4 = sc.nextInt();
                    System.out.println("Result: " + divide(a4, b4));
                    break;
                case 5:
                    System.out.print("Enter three numbers: ");
                    int a5 = sc.nextInt(), b5 = sc.nextInt(), c5 = sc.nextInt();
                    System.out.println("Max number is: " + maxofThree(a5, b5, c5));
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    if (isPrime(n))
                        System.out.println(n + " is a prime number.");
                    else
                        System.out.println(n + " is not a prime number.");
                    break;
                case 7:
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

