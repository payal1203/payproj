package lec9;

public class CheckNumber {
	public static boolean checkarr(int arr[], int x,int startindex) {
		if(startindex==arr.length) {
			return false;
		}
		if(arr[startindex]==x) {
			return true;
		}
		else {
			return checkarr( arr,x,startindex+1);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
