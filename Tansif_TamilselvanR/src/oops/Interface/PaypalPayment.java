package oops.Interface;

public class PaypalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}