package lec9;

public class LastIndex {
	public static int index(int[] arr,int x,int startindex) {
		if(startindex==arr.length) {
			return -1;
		}
		int index=index(arr,x,startindex+1);
		if(index==-1) {
			if(arr[startindex]==x) {
				return startindex;
			}
			else {
				return -1;
			}
		}
		else {
			return index;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,6,8,2,3};
		System.out.println(index(arr,2,0));

	}

}
