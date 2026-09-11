package FirstModule;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the base of rectangle");
        int base = scanner.nextInt();

        System.out.println("Enter the length of the size of rectangle");
        int size = scanner.nextInt();

        int area = base * size;

        System.out.println("The area of the rectangle is: " + area);
    }
}
