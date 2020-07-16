package lec2;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i=1;
		int temp;
		int a=s.nextInt();
		temp=a;
		while (i<=(n-1)) {
		    int p = s.nextInt();
			if(p>temp) {
				temp=p;
			}	
			i=i+1;
		}
		System.out.println("largest number:");
		System.out.println(temp);
	}

}
