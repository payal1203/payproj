package lec415;

import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {
	public static int[] Takeinput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			int a=s.nextInt();
			arr[i]=a;
		}
		
		return arr;
	}
	public static void Printarr(int arr[]) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]=Takeinput();
		Printarr(arr);
		Arrays.sort(arr);
		Printarr(arr);
				
		
  
	}

}
