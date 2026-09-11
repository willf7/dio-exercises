package FirstModule;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = scanner.nextLine();

        System.out.println("Type your birth date yar");
        int birthDateYear = scanner.nextInt();

        int age = LocalDate.now().getYear() - birthDateYear;

        System.out.println("Hello" + name + ", you have " + age + " years");

        scanner.close();
    }
}
