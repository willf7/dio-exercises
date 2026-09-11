package FirstModule;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first age");
        int firstAge = scanner.nextInt();

        System.out.println("Enter the second age");
        int secondAge = scanner.nextInt();

        int ageDifference = Math.abs(firstAge - secondAge);

        System.out.println("The age difference is: " + ageDifference);
    }
}
