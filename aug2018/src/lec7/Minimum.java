package lec7;

import java.util.Scanner;

public class Minimum {
	public static String minlength(String str) {
		
		int start=0;
		int end;
		String min ="";
		int minimum=Integer.MAX_VALUE;
		int count=0;
		String mm;
		for(int i=0 ;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				end=i-1;
				mm="";
				count=0;
				for(int j=start;j<=end;j++) {
					mm=mm+str.charAt(j);
				    count+=1;
					}
				
				    
				
				start=i+1;
				if(count<minimum) {
					minimum=count;
					min=mm;
				}
				
				
			}
			}
		count=0;
		mm="";
		for(int j=start;j<=str.length()-1;j++) {
			mm=mm+str.charAt(j);
			count+=1;
		}
		if(count<minimum) {
			minimum=count;
			min=mm;
		}
		return min;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str =s.nextLine();
		
		System.out.println(minlength(str));
	}

}
/*int start=0;
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
		return result;*/
