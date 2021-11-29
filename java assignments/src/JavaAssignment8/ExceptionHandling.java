package JavaAssignment8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ExceptionHandling {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password= scanner.next();
        try {

            if (password.length()<8) {
                throw new PasswordLengthLess("Password should not contain less than 8 characters.");
            }
            if (password.length() > 20) {
                throw new PasswordLengthExceeded("Password should not contain more than 8 characters.");
            }
            if (!Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,20}",password)) {
                throw new InvalidPassword("Invalid Password.");
            }
            //throw new NullPointerException();  This is to show the finally block gets executed.
            System.out.println("No Exceptions Caught");
        } catch (InvalidPassword | PasswordLengthLess | PasswordLengthExceeded ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
