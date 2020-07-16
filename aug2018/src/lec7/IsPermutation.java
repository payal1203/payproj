package lec7;

public class IsPermutation {
	public static boolean permutation(String str1,String str2) {
		boolean isperm=true;
		int arr[]=new int[26];
		for(int i=0;i<str1.length();i++) {
			arr[(int)str1.charAt(i)-97]++;
		}
		for(int i=0;i<str2.length();i++) {
			arr[(int)str2.charAt(i)-97]--;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				isperm=false;
			}
		}
		
		
		return isperm;
	}

	public static void main(String[] args) {
		System.out.println(permutation("abcdef","acfedd"));
	}

}
