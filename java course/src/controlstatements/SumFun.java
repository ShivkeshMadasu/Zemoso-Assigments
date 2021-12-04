package controlstatements;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Non-negative integer : ");

        int num = scanner.nextInt();
        int sum = 0;

        while( num >= 0 ){
            sum=sum+num;
            System.out.println("Sum is :" + sum);
            System.out.println("Enter a Non-negative integer : ");
            System.out.println("Enter negative number to exit :");
            num = scanner.nextInt();
        }
        System.out.println("Final sum is " +  sum);
    }
}
