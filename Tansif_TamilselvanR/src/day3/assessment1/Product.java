package day3.assessment1;

//Product.java
public class Product {
 private int productId;
 private String name;
 private double price;
 private int quantity;

 // Default constructor
 public Product() {}

 // Parameterized constructor
 public Product(int productId, String name, double price, int quantity) {
     this.productId = productId;
     this.name = name;
     this.price = price;
     this.quantity = quantity;
 }

 // Getters
 public int getProductId() {
     return productId;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public int getQuantity() {
     return quantity;
 }

 // Setters
 public void setProductId(int productId) {
     this.productId = productId;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }

 // To print product details
 @Override
 public String toString() {
     return "Product{" +
             "productId=" + productId +
             ", name='" + name + '\'' +
             ", price=" + price +
             ", quantity=" + quantity +
             '}';
 }
}

