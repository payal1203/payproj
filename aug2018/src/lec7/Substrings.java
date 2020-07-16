package lec7;

import java.util.Scanner;

public class Substrings {
	public static void printsub(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
				
			}
		}
	}
    
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str =s.next();
		printsub(str);
		
	}

}
