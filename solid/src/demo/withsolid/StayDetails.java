package demo.withsolid;
import java.time.LocalDate;

public class StayDetails {
    private String custName;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int roomNo;
    private double totalBill;

    StayDetails(String custName, LocalDate fromDate, LocalDate toDate, int roomNo)
    {
        this.custName = custName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.roomNo = roomNo;
    }

    public LocalDate getFromDate()
    {
        return fromDate;
    }

    public LocalDate getToDate()
    {
        return toDate;
    }

    public void setTotalBill(double totalBill)
    {
        this.totalBill = totalBill;
    }

    public double getTotalBill()
    {
        return totalBill;
    }
}

