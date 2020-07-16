package lec8;

public class Spiral {
	public static void spiralprint(int[][]arr) {
		int rows=arr.length;
		int cols=arr[0].length;
		int rowstart=0;
		int rowend=arr.length;
		int colstart=0;
		int colend=arr[0].length;
		int c=1;
		while(c<=(rows*cols)) {
			for(int j=colstart;j<colend;j++) {
				System.out.print(arr[rowstart][j]+" ");
				c++;
			}
			rowstart++;
			for(int i=rowstart;i<rowend;i++) {
				System.out.print(arr[i][colend-1]+" ");
				c++;
			}
			colend--;
			for(int j=colend;j>=colstart;j--) {
				System.out.print(arr[rowend-1][j]+" ");
				c++;
			}
			rowend--;
			for(int i=rowend;i>=rowstart;i--) {
				System.out.print(arr[i][colstart]);
				c++;
			}
			colstart++;
		}
	}

	public static void main(String[] args) {
		
	}

}
