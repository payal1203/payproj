package stackproblems;
import java.util.Stack;
public class ReverseStack {
	public static void reverse(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.isEmpty()) {
			return;
		}
		int val=s1.pop();
		reverse(s1,s2);
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(val);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
	}
	public static void main(String[] args) {
	
	}
}
