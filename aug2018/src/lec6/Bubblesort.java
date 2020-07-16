package lec6;

import java.util.Scanner;

public class Bubblesort {
	public static void Bubble(int arr[]) {
		for(int round=1;round<arr.length;round++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
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
		Scanner s=new Scanner(System.in);
		int arr[]=Takeinput();
		Printarr(arr);
		System.out.println();
		Bubble(arr);
		Printarr(arr);

	}

}
