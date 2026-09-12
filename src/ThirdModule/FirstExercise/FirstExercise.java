package ThirdModule.FirstExercise;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldShowMenu = true;

        System.out.println("Create your account");
        System.out.println("Enter your initial balance");
        double initialBalance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(initialBalance);

        do {
            showMenuOptions();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: R$ " + bankAccount.getBalance());
                    System.out.println("Available balance: R$ " + bankAccount.getAvailableBalance());
                    break;
                case 2:
                    System.out.println("Overdraft limit: R$ " + bankAccount.getOverdraftLimit());
                    System.out.println("Available overdraft: R$ " + bankAccount.getAvailableOverdraft());
                    break;
                case 3:
                    System.out.println("Enter the deposit amount:");
                    double depositAmount = scanner.nextDouble();

                    bankAccount.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Enter the withdrawal amount:");
                    double withdrawalAmount = scanner.nextDouble();

                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 5:
                    System.out.println("Enter the bill amount:");
                    double billAmount = scanner.nextDouble();

                    bankAccount.payBill(billAmount);
                    break;
                case 6:
                    if (bankAccount.isUsingOverdraft()) {
                        System.out.println("The account is using overdraft.");

                        System.out.println("Used overdraft: R$ " +bankAccount.getUsedOverdraft());

                        System.out.println("Overdraft fee: R$ " + bankAccount.getOverdraftFee());
                    } else {
                        System.out.println("The account is not using overdraft.");
                    }
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    shouldShowMenu = false;
                    break;
            }
        } while (shouldShowMenu);
    }

    private static void showMenuOptions() {
        System.out.println("Menu options:");
        System.out.println("1 - Confer balance");
        System.out.println("2 - Confer overdraft");
        System.out.println("3 - Deposit");
        System.out.println("4 - Withdrawal");
        System.out.println("5 - Pay a bill");
        System.out.println("6 - Confer used overdraft");
        System.out.println("7 - Exit");
    }
}
