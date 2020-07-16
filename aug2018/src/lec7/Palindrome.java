package lec7;

import java.util.Scanner;

public class Palindrome {
	public static boolean Palin(String str) {
		int i=0;
		int n=str.length()-1;
		int j=str.length()-1;
		while(!(i>j)) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str =s.next();
		boolean a=Palin(str);
		System.out.println(a);
		

	}

}
