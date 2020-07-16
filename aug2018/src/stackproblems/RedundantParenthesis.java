package stackproblems;
import java.util.Stack;
public class RedundantParenthesis {
	public static boolean checkredundant(String input) {
		int count=0; 
		Stack<Character> s=new Stack<Character>();
		for(int i=0;i<input.length();i++) {
			char cc=input.charAt(i);
    		if(cc=='(') {
    			count=0;
    			s.push(cc);
    		}
    		
    		else {
    			
    				count++;
    			}
    		if(count==0) {
    			return true;
    		}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
