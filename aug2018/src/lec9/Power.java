package lec9;

public class Power {
	public static int pow(int x,int n) {
		if(n==0) {
			return 1;
		}
		int total=x*pow(x,n-1);
		return total;
	}

	public static void main(String[] args) {
		int n=5;
		int res=pow(n,4);
		System.out.println(res);

	}

}
