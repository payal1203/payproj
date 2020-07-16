package lec6;

import java.util.Scanner;

public class SelectionSort {
	public static void Selection(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int minI=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(min>arr[j]) {
					min=arr[j];
					minI=j;
				}
			}
			
			int temp=arr[minI];
			arr[minI]=arr[i];
			arr[i]=temp;
			
			}
	}
	public static int[] Takeinput() {
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
	}
	public static void Printarr(int arr[]) {
		System.out.println("the array is\n");
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		int arr[]=Takeinput();
		Printarr(arr);
		System.out.println();
		Selection(arr);
		Printarr(arr);


	}

}
