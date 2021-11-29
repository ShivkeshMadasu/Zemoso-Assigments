package demo.withsolid;

import java.time.LocalDate;

public class HotelStay {
    public static void main(String[] args)
    {
        StayDetails stayDetail = new StayDetails("Shivkesh", LocalDate.of(2021,11,18), LocalDate.of(2021,11,24), 219);
        RoomCost roomCost = new RoomCost(new SingleBedRoom());

        CalculateBill calculate = new CalculateBill();
        stayDetail.setTotalBill(calculate.calculateBill(stayDetail,roomCost));

        double amount = stayDetail.getTotalBill();
        System.out.println("TotalBill:" +amount);

        System.out.println();
        PaymentUsingCash payCash = new PaymentUsingCash(new CashPayment());
        payCash.cashPay(amount);

        System.out.println();
        PaymentUsingCard debitCard = new PaymentUsingCard(new DebitCardPayment());
        debitCard.cardPay(amount);

        System.out.println();
        PaymentUsingCard creditCard = new PaymentUsingCard(new CreditCardPayment());
        creditCard.cardPay(amount);
    }
}
