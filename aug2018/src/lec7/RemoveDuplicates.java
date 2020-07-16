package lec7;

public class RemoveDuplicates {
	public static String Remove(String str) {
		String newstr=new String();
		newstr=newstr+str.charAt(0);
		for(int i=1;i<str.length();i++) {
			 if(str.charAt(i)!=str.charAt(i-1)) {
				 newstr=newstr+str.charAt(i);
			 }
		}
		
		return newstr;
		
	}

	public static void main(String[] args) {
		String str="aabbccaa";
		System.out.println(Remove(str));
	}

}
