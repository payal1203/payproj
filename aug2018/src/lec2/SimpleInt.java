package lec2;

import java.util.Scanner;

public class SimpleInt {
	public static int Simpleint(int p,int r,int t) {
		int si=(p*r*t)/100;
		return si;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int p= scn.nextInt();
		int r= scn.nextInt();
		int t= scn.nextInt();
		int s=Simpleint(p,r,t);
		
		System.out.println(s);
		 

	}

}
