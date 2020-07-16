package lec2;

import java.util.Scanner;

public class Prime {



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=2;
		int flag = 0;
		int n=s.nextInt();
		for(i=2;i<=n;i++) {
			flag = 0;
			
			for(int j=2;j<=(i-1);j++) {
				if (i%j==0) {
					
					flag=1;
					
				}
				
			}
			if(flag==0) {
				System.out.println(i);
			}
			
		}
		
	
		

	}

}
