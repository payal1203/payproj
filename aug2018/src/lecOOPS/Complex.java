package lecOOPS;

import java.util.Scanner;

public class Complex {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNos c1 = new ComplexNos(real1, imaginary1);
		ComplexNos c2 = new ComplexNos(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			
			c1.add(c2);
			c1.print();
		}
		else if(choice == 2) {
			
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}

	}

}
