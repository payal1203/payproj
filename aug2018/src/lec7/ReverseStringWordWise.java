package lec7;

public class ReverseStringWordWise {
    public static String ReverseWord(String str) {
    	int end=str.length();
		int start;
		String result="";
		for(int i=str.length()-1 ;i>=0;i--) {
			
			if(str.charAt(i)==' ') {
				start=i+1;
				String rev="";
				for(int j=start;j<end;j++) {
					rev=rev+str.charAt(j);
					
				}
				System.out.println(rev+"rev");
				end=i+1;
				result=result+rev+" ";
			}
			}
		for(int j=0;j<end-1;j++) {
			result=result+str.charAt(j);
		}
		return result;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="Welcome to coding ninjas";
      System.out.println(ReverseWord(str));
	}

}
