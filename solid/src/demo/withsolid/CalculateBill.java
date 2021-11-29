package demo.withsolid;

import java.time.temporal.ChronoUnit;

public class CalculateBill {
    public double calculateBill(StayDetails stayDetail, RoomCost roomCost)
    {
        double total;
        long noOfDays;
        noOfDays= ChronoUnit.DAYS.between(stayDetail.getFromDate(),stayDetail.getToDate());
        total = noOfDays* (roomCost.getCost());

        return total;
    }
}
