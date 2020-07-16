package lec7;

public class CompresstheString {
    public static String compress(String str) {
    	String result="";
    	str=str+" ";
    	int count=1;
    	for(int i=0;i<str.length()-1;i++) {
    		if(str.charAt(i)==str.charAt(i+1)){
    			count++;
    		}
    		else {
    			if(count==1) {
    				result=result+str.charAt(i);
        			
    			}
    			else {
    				result=result+str.charAt(i)+count;
        			
    			}
    			count=1;
    		}
    		
    	}
    	return result;
    }
	public static void main(String[] args) {
		String str=compress("aabbbcc");
		System.out.println(str);

	}

}
