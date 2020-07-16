package lec415;

public class RotateArrayLeft {
	public static int[] Rotate(int[] arr,int x) {
		
		int[] arr1= new int[x];
		for(int j=0;j<x;j++) {
			arr1[j]=arr[j];
		}
		for(int i=0;i<arr.length-x;i++) {
			arr[i]=arr[i+x];
			
			
		}
		int k=0;
		int i=arr.length-1;
		while(i>=arr.length-x) {
			arr[i]=arr1[arr1.length-1-k];
			i--;
			k++;
		}
		
		return arr;

	}
	

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7};
		Rotate(arr,7);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
