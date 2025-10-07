package oops.Interface;

	public class UpiPay implements Payment {
	    public void pay(double amount) {
	        System.out.println("Paid ₹" + amount + " using UPI.");
	    }
}
