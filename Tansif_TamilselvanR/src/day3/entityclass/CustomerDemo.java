package day3.entityclass;

public class CustomerDemo{
    public static void main(String[] args) {
        // Using default constructor + setters
        Customer c2 = new Customer();
        c2.setId(102);
        c2.setCname("Meena");
        c2.setCity("Coimbatore");
        // Print customers
        System.out.println(c2);
    }
}
