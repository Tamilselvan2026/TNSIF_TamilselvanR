package oops.Interface;

public class CreditCardPayment implements Payment {
	 public void pay(double amount) {
	        System.out.println("Paid ₹" + amount + " using Credit Card.");
	    }
}



