package JavaAssignment2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtoZ {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.next();
        if(stringCheck(input))
        {
            System.out.println("String contains all the alphabets");
        }
        else
        {
            System.out.println("String doesn't contain all the alphabets");
        }
    }

    public static boolean stringCheck(String input)
    {
        Set<Character> alphabets = new HashSet<Character>();
        for(int i=0; i<input.length(); i++)
        {
            char letter = input.charAt(i);
            if((letter >= 'a' && letter <='z' || letter >= 'A' && letter <= 'Z') && (alphabets.size()<=25))
            {
                alphabets.add(Character.toUpperCase(letter));
            }
        }
        return alphabets.size() == 26;
    }
}
