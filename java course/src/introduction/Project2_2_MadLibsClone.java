package introduction;

import java.util.Scanner;

public class Project2_2_MadLibsClone {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjecvtive: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter a girl's name: ");
        String girlName = scanner.nextLine();

        System.out.print("Enter another adjecvtive: ");
        String adjective2 = scanner.nextLine();

        System.out.print("Enter an occupation: ");
        String occupation1 = scanner.nextLine();

        System.out.print("Enter the name of a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter the name of a piece of clothing: ");
        String clothing = scanner.nextLine();

        System.out.print("Enter the name of a hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective3 = scanner.nextLine();

        System.out.print("Enter another occupation: ");
        String occupation2 = scanner.nextLine();

        System.out.print("Enter a boy's name: ");
        String boyName = scanner.nextLine();

        System.out.print("Enter a man's name: ");
        String manName = scanner.nextLine();

        System.out.println("There was once a " + adjective1 + "girl named " + girlName + ", " + "who was a " + adjective2 + occupation1 + "in the kingdom of " + place + "." + "She loved to wear " + clothing + "and to " + hobby + "." + "She wanted to mary the " + adjective3 + occupation2 + "named "+ boyName + "but her father,King " + manName + "forbid her from seeing him.");


    }
}
