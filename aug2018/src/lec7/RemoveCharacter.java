package lec7;

public class RemoveCharacter {
	public static String removechar(String str,char c) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				result=result+str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
