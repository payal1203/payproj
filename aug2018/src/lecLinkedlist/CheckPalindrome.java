package lecLinkedlist;

public class CheckPalindrome {
    public static boolean  isPalindrome_2(Linkedlistnode<Integer> head) {
    	
    	boolean ispalindrome=true;
    	if(head==null) {
    		return ispalindrome;
    	}
    	Linkedlistnode<Integer> fast=head;
    	Linkedlistnode<Integer> slow=head;
    	//finding midpoint for splitting
    	while(fast.next!=null && fast.next.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	//split into half
    	Linkedlistnode<Integer> head2=slow.next;
    	slow.next=null;
    	//reverse the second half 
    	
    	head2=Reverse(head2);
    	//check each element of LL
    	Linkedlistnode<Integer> temp1=head;
    	Linkedlistnode<Integer> temp2=head2;
    	while(temp2!=null) {
    		if(temp2.data!= temp1.data) { //checks for palindrome
    			ispalindrome=false;
    			break;
    		}
    		temp2=temp2.next;
    		temp1=temp1.next;
    	}
    	//reversing the secondLL again
    	head2=Reverse(head2);
    	slow.next=head2;
    	
    	return ispalindrome;
    }
    public static Linkedlistnode<Integer> Reverse(Linkedlistnode<Integer> head){
    	Linkedlistnode<Integer> current=head;
    	Linkedlistnode<Integer> prev=null;
    	Linkedlistnode<Integer> temp=null;
    	while(current!=null) {
    	     temp=current.next;
    	     current.next=prev;
    	     prev=current;
    	     current=temp;
    		
    	}
    	head=prev;
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
