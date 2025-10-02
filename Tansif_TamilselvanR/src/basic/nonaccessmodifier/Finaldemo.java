package basic.nonaccessmodifier;

public class Finaldemo {
		
		final int Var = 100;
		
		final void display() {
			System.out.println("show the value of max: "+Var);
		}

		public static void main(String[] args) {
			Finaldemo fd = new Finaldemo();
			fd.display();
			//fd.Var = 100;

		}

	}

	class Child extends Finaldemo{
		void displays() {
			System.out.println("show the value of max: "+Var);
		}
	}

