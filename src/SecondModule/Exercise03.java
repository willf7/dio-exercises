package SecondModule;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number (greater than the first):");
        int secondNumber = scanner.nextInt();

        if (firstNumber >= secondNumber) {
            throw new Error("The first number is greater than or equal to the second. Please try again.");
        }

        System.out.println("Enter 1 to choose odd and 2 to choose even:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = firstNumber; i <= secondNumber ; i++) {
                    if (i % 2 != 0) {
                        System.out.println("The number " + i + " is odd");
                    }
                }
                break;
            case 2:
                for (int i = firstNumber; i <= secondNumber ; i++) {
                    if (i % 2 == 0) {
                        System.out.println("The number " + i + " is even");
                    }
                }
                break;
        }

        scanner.close();
    }
}
