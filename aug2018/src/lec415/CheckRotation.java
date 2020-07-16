package lec415;

public class CheckRotation {
	public static int Check(int[] arr) {
		int flag=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag=i+1;
			}
		}
		
		return flag;
	}
                      
	public static void main(String[] args) {
		int[] arr= {11,12,13,1,2,3};
        System.out.println(Check(arr));
	}

}
