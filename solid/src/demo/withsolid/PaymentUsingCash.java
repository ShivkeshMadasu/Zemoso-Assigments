package demo.withsolid;

public class PaymentUsingCash {
    private Payment pay;
    PaymentUsingCash(Payment pay)
    {
        this.pay= pay;
    }
    public void cashPay(double amount)
    {
        pay.payment(amount);
    }
}
