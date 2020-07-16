package lecLinkedlist;

public class lengthLL {
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
