package lec6;

import java.util.Scanner;

public class BinarySearch {
	public static int Search(int arr[],int elem) {
		int index=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==elem) {
				index=mid;
	            break;
			}
			else if (elem<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
				
			}
		}
		return index;
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
		System.out.println("the given array is\n");
		for(int i=0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=Takeinput();
		Printarr(arr);
		System.out.println("enter the element to be searched");
		int elem=s.nextInt();
		int position=Search(arr,elem);
		System.out.println(position);
	}

}
