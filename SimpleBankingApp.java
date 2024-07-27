package SimpleBankingBankingApp;

import java.util.Scanner;

public class SimpleBankingApp {
    //        make the app to ask user name and
//        prompt hello[name] welcome to  the simple banking app

    private static double balance = 0.0;
    private static final String PASSWORD = "mysecret";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Welcome to My Simple Banking App!");
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(PASSWORD)) {
            System.out.println("Authentication successful!");
            showMenu();
        } else {
            System.out.println("Incorrect password. Exiting...");
        }
    }

    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: R");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: R");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Your balance: R" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Banking App!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: R" + balance);
    }

    private static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: R" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
