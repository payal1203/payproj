package lec415;

import java.util.Scanner;

public class Summ {
	public static int findDifference(int[] input){
         int sumo=0;
         int sume=0;
      
         for(int i = 0;i<input.length;i++) {
           if(i%2==0){
             sume=sume+input[i];
           }
           else{
             sumo=sumo+input[i];
           }
		}
         int diff =sume-sumo;
	     return diff;
}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			int a=s.nextInt();
			arr[i]=a;
		}
		int b=findDifference(arr);
		System.out.println(b);
		
	}  

}
