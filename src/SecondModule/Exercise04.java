package SecondModule;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial number:");
        int initialNumber = scanner.nextInt();
        int otherNumber;

        do {
            System.out.println("Enter other number:");
            otherNumber = scanner.nextInt();
        } while (otherNumber < initialNumber || (otherNumber % initialNumber != 0));

        scanner.close();
    }
}
