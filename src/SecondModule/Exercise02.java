package SecondModule;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height");
        double height = scanner.nextDouble();

        double imcResult = weight / (height * height);

        System.out.println("Imc result: " + imcResult);
        System.out.println("Imc classification:");

        if (imcResult <= 18.5) {
            System.out.println("Underweight");
        } else if (imcResult >= 18.6 && imcResult <= 24.9) {
            System.out.println("Ideal weight");
        } else if (imcResult >= 25 && imcResult <= 29.9) {
            System.out.println("Slightly overweight");
        } else if (imcResult >= 30 && imcResult <= 34.9) {
            System.out.println("Class I Obesity");
        } else if (imcResult >= 35 && imcResult <= 39.9) {
            System.out.println("Class II (Severe) Obesity");
        } else if (imcResult >= 40) {
            System.out.println("Class III (Morbid) Obesity");
        }

        scanner.close();
    }
}
