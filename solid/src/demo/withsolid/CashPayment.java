package demo.withsolid;

public class CashPayment implements Payment{
    public void payment(double amount)
    {
        System.out.println("Payment mode: Cash");
        System.out.println("Total amount paid: "+amount);
    }
}

