package lec415;

public class Sort012array {
 public static int[] sort012(int[] arr) {
	 
	 int i=0;
	 int j=arr.length-1;
	 int[] temp=new int[arr.length];
	 for(int k=0;k<arr.length;k++) {
		 if(arr[k]==0) {
			 temp[i]=0;
			 i++;
			 
		 }
		 else if(arr[k]==2){
			 temp[j]=2;
			 j--;
		 }
	 }
	 for(int k=i;k<=j;k++) {
		 temp[k]=1;
		 
	 }
	 
	return temp;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
