package introduction;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        System.out.println("enter number : ");
        num1 = scanner.nextDouble();
        num1 *= 2;
        scanner.nextLine();
        String city;
        System.out.println("enter city : ");
        city = scanner.nextLine();
        System.out.println("twice number is : " + num1);
        System.out.println("city is : " + city);
    }
}
