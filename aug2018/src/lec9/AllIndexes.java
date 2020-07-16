package lec9;

public class AllIndexes {
	public static int[] indexes(int arr[],int x,int startindex) {
		if(startindex==arr.length) {
			int[] result=new int[0];
			return result;
		}
		int[] allindex=indexes(arr,x,startindex+1);
		if(arr[startindex]==x) {
			int[] arr1=new int[allindex.length +1];
			arr1[0]=startindex;
			for(int i=0;i<allindex.length;i++) {
				arr1[i+1]=allindex[i];
			}
			return arr1;
		}
		else {
			return allindex;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
