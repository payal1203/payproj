package lec7;

import java.util.Scanner;

public class Replacech {
	public static String Replace(String str,char a,char b) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==a) {
				str1=str1+b;
			}
			else {
				str1=str1+str.charAt(i);
			}
			
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str =s.next();
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		String str1=Replace(str,a,b);
		System.out.println(str1);
	}

}
