package lecLinkedlist;

public class Deletion_LL_Recursively {
    public static Linkedlistnode<Integer> deleterec(Linkedlistnode<Integer> head,int pos){
    	if(head==null) {
    		return head;
    	}
    	if(pos==0) {
    		head=head.next;
    		return head;
    	}
    	head.next=deleterec(head.next, pos-1);
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
