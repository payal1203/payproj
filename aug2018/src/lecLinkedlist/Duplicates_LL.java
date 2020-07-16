package lecLinkedlist;
import lecLinkedlist.Linkedlistuse;
public class Duplicates_LL {
	public static Linkedlistnode<Integer> Duplicates(Linkedlistnode<Integer> head){
		if(head==null) {
			return head;
		}
		Linkedlistnode<Integer> temp=head;
		
		while(temp.next!=null) {
			if((int)temp.data==(int)temp.next.data) {
				temp.next=temp.next.next; 
				
			}
			
			else {
			temp=temp.next;
			}
			
		}
		
		return head;
	}

	public static void main(String[] args) {
		Linkedlistnode<Integer> head=Linkedlistuse.takeinput();
		Duplicates(head);
		Linkedlistuse.print(head);

	}

}
