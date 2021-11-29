package demo.withsolid;

public class DebitCardPayment implements CardPayment{
    @Override
    public void payment(double amount) {
        System.out.println("Payment mode: Debit Card");
        System.out.println("Total amount paid: "+(amount+tax(amount)));
    }

    @Override
    public double tax(double amount) {
        return amount*0.05;
    }
}

