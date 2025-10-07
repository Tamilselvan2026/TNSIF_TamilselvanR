package oops.Interface;

public class Checkout {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(500.0);

        payment = new PaypalPayment();
        payment.pay(750.0);

        payment = new UpiPay();
        payment.pay(300.0);
    }
}



