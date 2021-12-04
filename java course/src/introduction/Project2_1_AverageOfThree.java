package introduction;

import java.util.Scanner;

public class Project2_1_AverageOfThree {
    public static void main(String[] args)
    {
        double num1, num2, num3, average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Three Numbers");
        num1= scanner.nextDouble();
        num2= scanner.nextDouble();
        num3= scanner.nextDouble();
        average=(num1+num2+num3)/3.0;
        System.out.println(average);
    }
}
