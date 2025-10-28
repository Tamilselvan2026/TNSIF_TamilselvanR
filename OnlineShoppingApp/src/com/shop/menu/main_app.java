package com.shop.menu;

import com.shop.entity.*;
import com.shop.service.*;
import java.util.Scanner;

public class main_app {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		product_service product_service = new product_service();
		customer_service customer_service = new customer_service();
		admin_service admin_service = new admin_service();
		order_service order_service = new order_service();

		int choice;
		do {
			System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1: // Admin Menu
				adminMenu(sc, product_service, admin_service, order_service);
				break;
			case 2: // Customer Menu
				customerMenu(sc, product_service, customer_service, order_service);
				break;
			}
		} while (choice != 3);
		System.out.println("Exiting...");
	}

	private static void adminMenu(Scanner sc, product_service ps, admin_service as, order_service os) {
	    int option;
	    do {
	        System.out.println("\nAdmin Menu:");
	        System.out.println("1. Add Product");
	        System.out.println("2. Remove Product");
	        System.out.println("3. View Products");
	        System.out.println("4. Create Admin");
	        System.out.println("5. View Admins");
	        System.out.println("6. Update Order Status");
	        System.out.println("7. View Orders");
	        System.out.println("8. Return");
	        System.out.print("Choose an option: ");
	        option = sc.nextInt();

	        switch (option) {
	            case 1:
	                System.out.print("Enter Product ID: ");
	                int pid = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter Product Name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter Product Price: ");
	                double price = sc.nextDouble();
	                System.out.print("Enter Stock Quantity: ");
	                int qty = sc.nextInt();
	                ps.addproduct(new product(pid, name, price, qty));
	                System.out.println("✅ Product added successfully!");
	                break;

	            case 2:
	                System.out.print("Enter Product ID to remove: ");
	                int removeId = sc.nextInt();
	                ps.removeProduct(removeId);
	                System.out.println("✅ Product removed successfully!");
	                break;

	            case 3:
	                System.out.println("\nProducts:");
	                if (ps.getAllProducts().isEmpty()) {
	                    System.out.println("⚠️ No products available!");
	                } else {
	                    ps.getAllProducts().forEach(System.out::println);
	                }
	                break;

	            case 4:
	                System.out.print("Enter Admin ID: ");
	                int aid = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter Username: ");
	                String aname = sc.nextLine();
	                System.out.print("Enter Email: ");
	                String aemail = sc.nextLine();
	                as.addAdmin(new admin(aid, aname, aemail));
	                System.out.println("✅ Admin created successfully!");
	                break;

	            case 5:
	                System.out.println("\nAdmins:");
	                if (as.getAllAdmins().isEmpty()) {
	                    System.out.println("⚠️ No admins found!");
	                } else {
	                    as.getAllAdmins().forEach(System.out::println);
	                }
	                break;
	            case 6:
	                System.out.print("Enter Order ID to update: ");
	                int orderId = sc.nextInt();
	                sc.nextLine(); // clear buffer

	                System.out.print("Enter new status (e.g., Pending, Shipped, Delivered, Cancelled): ");
	                String status = sc.nextLine();

	                boolean updated = os.updateOrderStatus(orderId, status);
	                if (updated) {
	                    System.out.println("Order status updated successfully!");
	                } else {
	                    System.out.println("Order not found!");
	                }
	                break;

	            case 7:
	                System.out.println("\nOrders:");
	                if (os.getAllOrders().isEmpty()) {
	                    System.out.println("⚠️ No orders found!");
	                } else {
	                    os.getAllOrders().forEach(System.out::println);
	                }
	                break;

	            default:
	                break;
	        }
	    } while (option != 8);
	}
	private static void customerMenu(Scanner sc, product_service ps, customer_service cs, order_service os) {
	    int option;
	    do {
	        System.out.println("\nCustomer Menu:");
	        System.out.println("1. Create Customer");
	        System.out.println("2. View Customers");
	        System.out.println("3. Place Order");
	        System.out.println("4. View Orders");
	        System.out.println("5. View Products");
	        System.out.println("6. Return");
	        System.out.print("Choose an option: ");
	        option = sc.nextInt();

	        switch (option) {
	            case 1:
	                System.out.print("Enter User ID: ");
	                int id = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter Username: ");
	                String username = sc.nextLine();
	                System.out.print("Enter Email: ");
	                String email = sc.nextLine();
	                System.out.print("Enter Address: ");
	                String address = sc.nextLine();
	                cs.addcustomer(new customer(id, username, email, address));
	                System.out.println("✅ Customer created successfully!");
	                break;

	            case 2:
	                System.out.println("\nCustomers:");
	                if (cs.getAllCustomers().isEmpty()) {
	                    System.out.println("⚠️ No customers found!");
	                } else {
	                    cs.getAllCustomers().forEach(System.out::println);
	                }
	                break;

	            case 3: // PLACE ORDER
	                System.out.print("Enter Customer ID: ");
	                int custId = sc.nextInt();
	                sc.nextLine(); // clear input buffer

	                customer customer = cs.getcustomerById(custId);
	                if (customer == null) {
	                    System.out.println("Customer not found!");
	                    break;
	                }

	                System.out.println("\nAvailable Products:");
	                ps.getAllProducts().forEach(System.out::println);

	                System.out.print("Enter Product ID to order: ");
	                int productId = sc.nextInt();
	                sc.nextLine(); // clear buffer

	                product product = ps.getproductById(productId);
	                if (product == null) {
	                    System.out.println("Invalid Product ID!");
	                    break;
	                }

	                System.out.print("Enter quantity: ");
	                int quantity = sc.nextInt();
	                sc.nextLine(); // clear buffer

	                if (quantity > product.getStockQuantity()) {
	                    System.out.println("Not enough stock available!");
	                    break;
	                }

	                // Add single item to cart and place order immediately
	                customer.getCart().addItem(product, quantity);
	                os.placeorder(customer);
	                System.out.println("Order placed successfully!");

	                break;
	            case 4: // VIEW ORDERS
	                System.out.print("Enter Customer ID: ");
	                int cId = sc.nextInt();
	                customer c = cs.getcustomerById(cId);
	                if (c == null) {
	                    System.out.println("❌ Customer not found!");
	                    break;
	                }
	                if (c.getorders().isEmpty()) {
	                    System.out.println("⚠️ No orders found for this customer!");
	                } else {
	                    c.getorders().forEach(System.out::println);
	                }
	                break;

	            case 5:
	                System.out.println("\nProducts:");
	                if (ps.getAllProducts().isEmpty()) {
	                    System.out.println("⚠️ No products available!");
	                } else {
	                    ps.getAllProducts().forEach(System.out::println);
	                }
	                break;

	            default:
	                break;
	        }
	    } while (option != 6);
	}
}
