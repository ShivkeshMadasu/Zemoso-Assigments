package JavaAssignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SearchFiles {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter done to exit. OR");
            System.out.println("Enter File name to search :");
            String regex = scanner.next();
            if (regex.equals("done")) {
                break;
            } else {
                searchDicrectory("D:\\Zemoso\\java course\\src",regex);
            }
        }
    }
    public static void searchDicrectory(String path ,String regex) {

        File head = new File(path);
        File[] list = head.listFiles();
        if (list.length>0) {
            for (File file : list) {
                if (file.isDirectory()) {
                    searchDicrectory(file.getAbsolutePath(), regex);
                } else {
                    if (Pattern.matches(regex, file.getName()))
                        System.out.println("File: " + file.getAbsoluteFile());
                }
            }
        }
    }
}
