package lec2;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1,sum=0;
		while(i<=n) {
			System.out.println("enter number to be added");
			int a=s.nextInt();
			sum=sum+a;
			i=i+1;
			}
		System.out.println("total sum");
		System.out.println(sum);
				
		

	}

}
