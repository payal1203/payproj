package lecLinkedlist;

import java.util.LinkedList;

public class Nth_NodeFromLast {
    public static Linkedlistnode<Integer> nthNodeFromLastIter(Linkedlistnode<Integer> head, int n){
    	 if(Length(head)<=n){
    	        return null;
    	      }
    	      
    			Linkedlistnode<Integer> temp=head;
    	    	for(int j=0;j<n;j++) {
    	    		temp=temp.next;
    	    	}
    	    	Linkedlistnode<Integer> slow=head;
    	    	while(temp.next!=null) {
    	    		temp=temp.next;
    	    		slow=slow.next;
    	    	}
    	    	return slow;
    		}
    	  public static int Length(Linkedlistnode<Integer> head) {
    	    	Linkedlistnode<Integer> temp=head;
    	    	int length=0;
    	    	while(temp!=null) {
    	    		length++;
    	    		temp=temp.next;
    	    	}
    	    	return length;
    	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
