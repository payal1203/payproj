package lecLinkedlist;

public class Deletion_LinkedList {
    public static Linkedlistnode<Integer> Deletion(Linkedlistnode<Integer> head,int pos){
    	if(pos>=Length(head)) {
    		return head;
    	}
    	
    	Linkedlistnode<Integer> ptr=head;
    	if(pos==0) {
    		head=head.next;
    	}
    	else {
    		int count=0;
        	while(count<pos-1 ) {
        		count++;
        		
        		ptr=ptr.next;
        	}
        	ptr.next=ptr.next.next;
        	/*while(count<pos-1 && ptr.next!=null ) {
        		count++;
        		
        		ptr=ptr.next;
        	}
        	if(ptr.next==null){
        	   ptr.next=ptr.next.next;
        	   } */ 
        	//if length function is not used
    	
    	}
    	return head;
    	
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
