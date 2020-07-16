package lec9;

public class Sumarray {
	public static int sum(int[] arr,int startindex) {
		if(startindex==arr.length) {
			return 0;
		}
		int result=arr[startindex]+sum(arr,startindex+1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
