package dynamicprogramming;

public class LongestcommonSubsequence {
	public static int LCSrec(String s1,String s2) {
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}
		if(s1.charAt(0)==s2.charAt(0)) {
			return 1+LCSrec(s1.substring(1), s2.substring(1));
		}
		else {
			int ans1=LCSrec(s1.substring(1), s2);
			int ans2=LCSrec(s1, s2.substring(1));
			return Math.max(ans1, ans2);
					
		}
	}
 /*public static int LCSmem(String s1,String s2,int storage[][],int i,int j) {
	 int ans1,ans2;
	 if(storage[i][j]!=-1) {
		 return storage[i][j]; 
	 }
	 else {
		 
	 }
 }*/
	public static void main(String[] args) {
		String s1="apeq";
		String s2="qpefa";
		int count =LCSrec(s1, s2);
		System.out.println(count);
	}

}
