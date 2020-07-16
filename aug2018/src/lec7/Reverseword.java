package lec7;

import java.util.Scanner;

public class Reverseword {
	public static String Reverse(String str) {
		int start=0;
		int end;
		String result="";
		for(int i=0 ;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				end=i-1;
				String rev="";
				for(int j=end;j>=start;j--) {
					rev=rev+str.charAt(j);
					
				}
				start=i+1;
				result=result+rev+" ";
			}
			}
		for(int j=str.length()-1;j>=start;j--) {
			result=result+str.charAt(j);
		}
		return result;
		
	}
	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str =s.nextLine();
		String result=Reverse(str);
		System.out.println(result);
	}

}
