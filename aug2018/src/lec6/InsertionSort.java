package lec6;

import java.util.Scanner;

public class InsertionSort {
	public static void Insertion(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int dec=i+1;
			
			
			while(dec>=1) {
				if(arr[dec]<arr[dec-1]) {
					int temp=arr[dec-1];
					arr[dec-1]=arr[dec];
					arr[dec]=temp; 
				}
				dec--; 
			}
			
			
				
		}
	}
	/**public static int[] Takeinput() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements\n");
		int n=s.nextInt();
		int []arr=new int[n];
		int i=0;
		System.out.println("enter the elements\n");
		for(i=0;i<n;i++) {
			
			int a=s.nextInt();
			arr[i]=a;
		}
		
		return arr;
	}**/
	 public static int[] Takeinput() {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of elements\n");
			int n=s.nextInt();
			int []arr=new int[n];
			int i;
			
			for(i=0;i<n;i++) {
				
				
				arr[i]=n-i;
			}
			
			return arr;
		}
	/**public static void Printarr(int arr[]) {
		System.out.println("the array is\n");
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}**/


	public static void main(String[] args) {
		int arr[]=Takeinput();
		
		long startTime = System.currentTimeMillis();
		Insertion(arr);
		long stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time was " + (stopTime - startTime));
		
		
	}

}
