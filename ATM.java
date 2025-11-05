import java.util.Scanner;

public class ATM {
    static int balance = 0;
    static final int PIN = 1234;

    public static void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount! Try again.");
        }
    }

    public static void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Try again.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        boolean isLoggedIn = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == PIN) {
                System.out.println("Login successful!");
                isLoggedIn = true;
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Wrong PIN! Attempts left: " + attempts);
                } else {
                    System.out.println("Account locked due to 3 wrong attempts!");
                    return;
                }
            }
        }

        if (isLoggedIn) {
            while (true) {
                System.out.println("\n==== ATM Menu ====");
                System.out.println("1) Deposit");
                System.out.println("2) Withdraw");
                System.out.println("3) Check Balance");
                System.out.println("4) Exit");
                System.out.print("Choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        withdraw(withdrawAmount);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                        continue;
                }
                if (choice == 4)
                    break;
            }
        }
        sc.close();
    }
}
