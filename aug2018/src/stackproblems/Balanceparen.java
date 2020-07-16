package stackproblems;
import java.util.Stack;

public class Balanceparen {
    public static boolean checkbalanced(String exp) {
    	Stack<Character> s=new Stack<Character>();
    	for(int i=0;i<exp.length();i++) {
    		char cc=exp.charAt(i);
    		if(cc=='(' || cc=='{' || cc=='[') {
    			s.push(cc);
    		}
    		else if(cc==')') {
    			if(!s.empty() && s.peek()=='(') {
    				s.pop();
    			}
    			else {
    				return false;
    			}
    		}
    		else if(cc=='}') {
    			if(!s.empty() && s.peek()=='{') {
    				s.pop();
    			}
    			else {
    				return false;
    			}
    		}
    		else if(cc==']') {
    			if(!s.empty() && s.peek()=='[') {
    				s.pop();
    			}
    			else {
    				return false;
    			}
    		}
    	}
    	return s.isEmpty();    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=checkbalanced("{ a + [ b+ (c + d)] + (e + f) ");
		System.out.println(res);

	}

}
