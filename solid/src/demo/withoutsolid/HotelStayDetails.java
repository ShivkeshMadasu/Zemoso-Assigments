package demo.withoutsolid;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelStayDetails {
    private String custName;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int roomNo;
    private double totalBill;
    private double cost;

    HotelStayDetails(String custName, LocalDate fromDate, LocalDate toDate, int roomNo)
    {
        this.custName = custName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.roomNo = roomNo;
    }

    public void roomCost(String roomInfo)
    {
        if(roomInfo.equals("SingleBedRoom"))
        {
            cost= 500.0;
        }
    }

    public void calculateBill()
    {
        long noOfDays;
        noOfDays= ChronoUnit.DAYS.between(fromDate,toDate);
        totalBill = noOfDays* (cost);
        System.out.println("TotalBill: "+totalBill);
    }

    public void payment(String paymenttype)
    {
        if(paymenttype.equals("Cash"))
        {
            System.out.println("Payment is done using Cash.");
        }
        else if(paymenttype.equals("DebitCard"))
        {
            System.out.println("Payment is done using DebitCard.");
        }
        else if(paymenttype.equals("CreditCard"))
        {
            System.out.println("Payment is done using CreditCard.");
        }
    }

    public static void main(String[] args){
        HotelStayDetails hsd = new HotelStayDetails("Shivkesh", LocalDate.of(2021,11,18), LocalDate.of(2021,11,24), 219);
        hsd.roomCost("SingleBedRoom");
        hsd.calculateBill();
        hsd.payment("Cash");
    }
}
