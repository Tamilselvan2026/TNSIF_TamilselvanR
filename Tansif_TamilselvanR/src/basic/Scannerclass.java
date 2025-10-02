package basic;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter your age: ");
		        int age = sc.nextInt();

		        System.out.print("Enter your marks: ");
		        double marks = sc.nextDouble();

		        System.out.println("\n--- User Details ---");
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Marks: " + marks);

		        sc.close();

	}

}
