package lecLinkedlist;

public class LinkedList_Midpoint {
    public static int Midpoint(Linkedlistnode<Integer> head) {
    	if(head==null) {
    		return -1;
    	}
    	Linkedlistnode<Integer> slow=head;
    	Linkedlistnode<Integer> fast=head;
    	while(fast.next!=null && fast.next.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow.data;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
