package controlstatements;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age and gender : ");

        int age = scanner.nextInt();
        scanner.nextLine();
        char gender = scanner.next().charAt(0);
        switch (gender) {
            case 'M':
            case 'm':
                if (age >= 19) {
                    System.out.println("Eligible.");
                    break;
                } else {
                    System.out.println("Not Eligible");
                    break;
                }
            case 'F':
            case 'f':
                if (age >= 19) {
                    System.out.println("Eligible.");
                    break;
                } else {
                    System.out.println("Not Eligible");
                    break;
                }
            default:
                System.out.println("Invalid Gender");
        }
    }
}