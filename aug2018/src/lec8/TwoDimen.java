package lec8;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimen {
	public static void colwise(int[][] arr) {
		int rows=arr.length;
		int cols=arr[0].length;
		for(int j=0;j<cols;j++) {
			if(j%2==0) {
			for(int i=0;i<rows;i++) {
				System.out.print(arr[i][j]+" ");}}
			else {
				for(int i=rows-1;i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				
			}
			}
		
	}}
	public static int[][] Takeinput() {
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int cols=s.nextInt();
		int [][]arr=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}
			
		}
		
		return arr;
	}
	public static void Printarr(int arr[][]) {
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int arr[][]=Takeinput();
		Printarr(arr);
		colwise(arr);
		
		

	}

}
