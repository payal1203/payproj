package lecLinkedlist;

public class Reverse_LL_Recursive {
	public static Linkedlistnode<Integer>  reverse_R(Linkedlistnode<Integer> head){
		if(head.next==null) {
			return head;
		}
		
			  Linkedlistnode<Integer> finalhead=reverse_R(head.next);
			   
				head.next.next=head;
				head.next=null;
				return finalhead;
		/*Linkedlistnode<Integer> temp=head;
		Linkedlistnode<Integer> next=head;
		head=reverse_R(head.next);
		while(next.next!=null) {
			next=next.next;
		}
		next.next=temp;
		temp.next=null;
		return head;*/
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
