package demo.withsolid;

public class PaymentUsingCard {
    private CardPayment cardPay;
    PaymentUsingCard(CardPayment cardPay)
    {
        this.cardPay= cardPay;
    }
    public void cardPay(double amount)
    {
        cardPay.payment(amount);
    }
}
