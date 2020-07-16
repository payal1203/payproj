package lecLinkedlist;

public class Print_Reverse_LL {
	public static void printreverse(Linkedlistnode<Integer> head) {
		if(head==null) {
			return;
		}
		printreverse(head.next);
		System.out.println(head.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
