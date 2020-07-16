package lec8;

import java.util.Scanner;

public class RowWiseSum {
	
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
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			
			System.out.print(sum+" ");
			
		}
	}


	public static void main(String[] args) {
		int arr[][]=Takeinput();
		Printarr(arr);
		

	}

}
