package demo.withsolid;

public interface CardPayment extends Payment {
    double tax(double amount);
}