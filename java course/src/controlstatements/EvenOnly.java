package controlstatements;

import java.util.Scanner;

public class EvenOnly {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while(count <= 10){
            if (count%2 == 0){
                System.out.print(count + " ");

            }
            else{
                count++;
                continue;
            }
            count++;
        }
    }

}
