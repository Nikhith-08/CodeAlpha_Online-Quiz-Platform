
import java.util.Scanner;

public class Online_Quiz_Platform {

    private double balance;

    public Online_Quiz_Platform(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nSuccessfully deposited: $" + amount);
        } else {
            System.out.println("\nDeposit amount must be greater than zero.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nSuccessfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("\nInsufficient balance. Transaction failed.");
        } else {
            System.out.println("\nWithdrawal amount must be greater than zero.");
        }
    }

    // Display menu options
    public static void displayMenu() {
        System.out.println("\nBanking Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("\nChoose an option: ");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Online_Quiz_Platform bankAccount = new Online_Quiz_Platform(0.0);
            boolean exit = false;

            System.out.println("\nWelcome to the Simple Banking Application!");

            while (!exit) {
                displayMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 ->
                        System.out.println("\nCurrent Balance: $" + bankAccount.checkBalance());
                    case 2 -> {
                        System.out.print("\nEnter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        bankAccount.deposit(depositAmount);
                    }
                    case 3 -> {
                        System.out.print("\nEnter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        bankAccount.withdraw(withdrawalAmount);
                    }
                    case 4 -> {
                        exit = true;
                        System.out.println("\nExiting the Banking Application. Thank you!\n");
                    }
                    default ->
                        System.out.println("\nInvalid option. Please try again.");

                }
            }
        }
    }
}
