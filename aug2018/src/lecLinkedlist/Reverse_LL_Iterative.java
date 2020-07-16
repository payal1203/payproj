package lecLinkedlist;

public class Reverse_LL_Iterative {
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
		

	}

}
