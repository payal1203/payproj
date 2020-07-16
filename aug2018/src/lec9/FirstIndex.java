package lec9;

public class FirstIndex {
	public static int index(int[] arr,int x,int startindex) {
		if(startindex==arr.length) {
			return -1;
		}
		if(arr[startindex]==x) {
			return startindex;
		}
		else {
			return index(arr,x,startindex+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
