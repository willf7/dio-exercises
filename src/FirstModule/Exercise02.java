package FirstModule;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of one side of a square:");
        int size = scanner.nextInt();

        int area = size * size;

        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}
