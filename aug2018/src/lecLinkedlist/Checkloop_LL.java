package lecLinkedlist;

public class Checkloop_LL {
    public static boolean checkloop(Linkedlistnode<Integer> head) {
    	Linkedlistnode<Integer> temp=head;
    	boolean loop=true;
    	while(temp.next!=null) {
    		return false;
    	}
    	return loop;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
