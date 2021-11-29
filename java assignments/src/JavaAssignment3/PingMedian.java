package JavaAssignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class PingMedian {
    public  static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the URL:");
        String url = scan.next();
        ArrayList<Double> time = new ArrayList<>();
        ProcessBuilder build = new ProcessBuilder("ping", url);
        Process process = build.start();
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String s = "";
        Double d;
        int start;
        int end;

        System.out.println("Standard output: ");
        while((s = input.readLine()) != null)
        {
            System.out.println(s);
            if(s.contains("time=")) {
                start = s.indexOf("time") + 5;
                end = s.indexOf("ms");
                d = Double.parseDouble(s.substring(start, end));
                time.add(d);
            }
        }
        Collections.sort(time);
        if(time.size()%2==0)
        {
            System.out.println("Median: " +(time.get(((time.size()/2)-1))+time.get(((time.size()+2)/2)-1))/2);
        }
        else
        {
            System.out.println("Median: " +time.get(((time.size()+1)/2)-1));
        }
    }
}
