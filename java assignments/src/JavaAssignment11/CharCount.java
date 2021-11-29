package JavaAssignment11;

import java.io.*;
import java.util.*;

public class CharCount {
    public static void main(String[] args)
    {
        try {
            Scanner inputfile = new Scanner(new File("Assignment11_input.txt"));
            PrintWriter outputfile = new PrintWriter("Assignment11_output.txt");
            Map<Character,Integer> charCount = new HashMap<Character,Integer>();
            while(inputfile.hasNext()) {
                char[] charArray = inputfile.next().toCharArray();
                for (char ch : charArray) {
                    if (charCount.containsKey(ch)) {
                        charCount.put(ch, charCount.get(ch) + 1);
                    } else {
                        charCount.put(ch, 1);
                    }
                }
            }
            for (Map.Entry<Character,Integer> entry : charCount.entrySet())
            {
                    outputfile.println(entry.getKey() + ": " + entry.getValue());
            }
            inputfile.close();
            outputfile.close();
        }

        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
