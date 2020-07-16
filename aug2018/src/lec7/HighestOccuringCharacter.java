package lec7;

public class HighestOccuringCharacter {
	public static char maxcount(String str) {
		int Arr[]=new int[26];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				Arr[26]++;
			}
			Arr[(int)str.charAt(i)-97]++;
			
		}
		int pos=0;
		char res='\0';
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++) {
			
			if(Arr[(int)str.charAt(i)-97]>max1) {
				
				max1=Arr[(int)str.charAt(i)-97];
				res=str.charAt(i);
			}
		}
		return res ;
	}

	public static void main(String[] args) {
		
    System.out.println(maxcount("bbaac")); 
	}

}
