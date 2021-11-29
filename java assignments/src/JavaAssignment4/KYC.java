package JavaAssignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KYC {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        String[][] input = new String[n][2];
        scan.nextLine();
        for(int i = 0; i < n; i++)
            input[i]= scan.nextLine().split(" ");
        try {
            for (int i = 0; i < n; i++) {
                String signUpDate = input[i][0];
                String currentDate = input[i][1];
                Date signUpDate1 = new SimpleDateFormat("dd-MM-yyyy").parse(signUpDate);
                Date currentDate1 = new SimpleDateFormat("dd-MM-yyyy").parse(currentDate);
                if(signUpDate1.after(currentDate1))
                {
                    System.out.println("No Range");
                }
                else
                {
                    Calendar currentYear = Calendar.getInstance();
                    Calendar signUpYear = Calendar.getInstance();
                    currentYear.setTime(currentDate1);
                    signUpYear.setTime(signUpDate1);
                    signUpYear.add(Calendar.DATE, -30);
                    signUpYear.set(Calendar.YEAR, currentYear.get(Calendar.YEAR));
                    Date startDate = signUpYear.getTime();
                    signUpYear.setTime(signUpDate1);
                    signUpYear.set(Calendar.YEAR, currentYear.get(Calendar.YEAR));
                    signUpYear.add(Calendar.DATE, 30);
                    Date endDate = signUpYear.getTime();
                    if(endDate.after(currentDate1))
                    {
                        endDate = currentDate1;
                    }
                    System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(startDate) + " " + new SimpleDateFormat("dd-MM-yyyy").format(endDate));
                }
            }
        }
        catch(ParseException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

