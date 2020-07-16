package lec415;

public class SecondLargestinArray {
	public static int secondlargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				
				largest=arr[i];}
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest && arr[i]>secondlargest) {
				secondlargest=arr[i];
			}
		}
		return secondlargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {6,6};
		System.out.println(secondlargest(arr));
	}

}
