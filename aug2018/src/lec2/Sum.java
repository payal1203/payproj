package lec2;

import java.util.Scanner;

public class Sum {
    public static int sum(int a,int b) {
    	return a+b;
    	
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		int b=s.nextInt();
		int c=sum(a,b);
		System.out.println(c);
		
		/*char ch='g';  
		System.out.println(ch);
		boolean bool= true;
		System.out.println(bool);*/
		

	}

}
