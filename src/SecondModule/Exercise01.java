package SecondModule;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to generate the multiplication table:");
        int baseNumber = scanner.nextInt();

        System.out.println("The multiplication table:");

        for (int i = 1; i <= 10; i++) {
            int multiplicationResult = baseNumber * i;
            System.out.println(baseNumber + " x " + i  + " = " + multiplicationResult);
        }

        scanner.close();
    }
}
