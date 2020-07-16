package lecLinkedlist;

public class BubbleSort_LL {
	public static Linkedlistnode<Integer> bubbleSort(Linkedlistnode<Integer> head )
	{   Linkedlistnode<Integer> temp=head;
	Linkedlistnode<Integer> ptr=head;
		int length=Length(head);
		
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-i-1;j++) {
				if((int)ptr.data>(int)ptr.next.data) {
					temp=ptr.next;
					ptr.next=ptr.next.next;
					temp.next=ptr;
				}
				if(head==ptr) {
					temp=head;
				}
			}
		}
		return temp;
	}
	 public static int Length(Linkedlistnode<Integer> head) {
	    	Linkedlistnode<Integer> temp= head;
	    	int length=0;
	    	while(temp!=null) {
	    		length++;
	    		temp=temp.next;
	    	}
	    	return length;
	    }
	public static void main(String[] args) {
		 

	}

}
