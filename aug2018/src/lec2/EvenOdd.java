package lec2;

import java.util.Scanner;

public class EvenOdd {
	public static boolean check(int n) {
		boolean iseven=true;
		if (n%2!=0) {
			iseven=false;
		}
		return iseven;
	}
	

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		if(check(n)==true) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		
	}

}
