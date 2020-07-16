package dynamicprogramming;

public class Fibonacci {
	public static int fibborec(int n,int[] storage) {
		if(n==0||n==1) {
			storage[n]=n;
			return n;
		}
		if (storage[n]!=0) {
			return storage[n];
		}
		else {
			int ans1;
			if(storage[n-1]!=0) {
				ans1=storage[n-1];
			}
			else {
				ans1=fibborec(n-1,storage);
				storage[n-1]=ans1;
			}
			int ans2;
			if(storage[n-2]!=0) {
				ans2=storage[n-2];
			}
			else {
				ans2=fibborec(n-2,storage);
				storage[n-2]=ans2;
			}
			storage[n]=ans1+ans2;
			return storage[n];
		}
	}
	public static int[] fibboitr(int n,int[] st) {
		if(n==0) {
			return st;
		}
		st[1]=1;
	  st[0]=0;
		for(int i=2;i<=n;i++) {
			st[n]=st[n-1]+st[n-2];
			
		}
		return st;
	}
	public static int minsteps(int n) {
		if(n==1) {
			return 0;
		}
		int ans1=minsteps(n-1);
		int ans2=Integer.MAX_VALUE;
		if(n%2==0) {
			ans2=minsteps(n/2);
		}
		int ans3=Integer.MAX_VALUE;
		if(n%3==0) {
			ans3=minsteps(n/2);
		}
		return 1+Math.min(ans1,Math.min(ans2, ans3 ));
	}
	public static int minsteps(int n,int[] st) {
		
		if(n==1) {
			st[1]=0;
			return st[1];
		}
		int ans1,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
		if(st[n]!=0) {
			return st[n];
		}
		else {
			if(st[n-1]==0) {
			ans1=minsteps(n-1,st);
			st[n-1]=ans1;}
			else {
				ans1=st[n-1];
			}
		
		if(n%2==0) {
			if(st[n/2]==0) {
				ans2=minsteps(n/2,st);
	            st[n/2]=ans2;
			}
			else {
				ans2=st[n/2];
			}
		}
		if(n%3==0) {
			if(st[n/3]==0) {
				ans3=minsteps(n/3,st);
	            st[n/3]=ans3;
			}
			else {
				ans3=st[n/3];
			}
		}
		st[n]=Math.min(ans1,Math.min(ans2, ans3) );
		return st[n];
		}
		
	}
	public static int countStepsTo1(int n){
		 int st[]=new int[n+1];
		 if(n==1) {
		  st[1]=0;
			 return st[n];
		 }
		 int ans1,ans2=Integer.MAX_VALUE;
		 int ans3=Integer.MAX_VALUE;
		 for(int i=2;i<=n;i++) {
			 ans1=st[i-1]+1;
			if(i%2==0) {
				ans2=st[i/2]+1;
			}
			else {
				ans2=Integer.MAX_VALUE;
			}
			if(i%3==0) {
				ans3=st[i/3]+1;
			}
			else {
				ans3=Integer.MAX_VALUE;
			}
			st[i]=Math.min(ans1, Math.min(ans2, ans3));
		 }
		 return st[n];
	}
	
	
	public static int staircaserec(int n,int[]st) {
		st[1]=1;
		st[2]=2;
		st[3]=4;
		
		if(st[n]!=0) {
			return st[n];
		}
		return 0;
	}
	

	public static void main(String[] args) {
		int res=countStepsTo1(7);
		System.out.println(res);
	}

}
