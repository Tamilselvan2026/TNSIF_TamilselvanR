package lambda;
import java.util.Scanner;
public class Fact {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number to factorial");
	  int a=sc.nextInt();
	  demo obj=(num)->{
	  int i,f=1;
	  for(i=1;i<=num;i++) {
		f=f*i;  
	  }
	  return f;
	  };
	  System.out.println("factorial of "+a+" is "+obj.factorial(a));
  }
}
