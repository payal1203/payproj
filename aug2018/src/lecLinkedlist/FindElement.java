package lecLinkedlist;

public class FindElement {
	public static int ReturnElement(Linkedlistnode <Integer> head,int i) {
		Linkedlistnode<Integer> temp=head;
		int count=-1;
		int pos=-1;
		while(temp!=null) {
			if(temp.data.equals(i)) {
				count++;
				pos=count;
				
			}
			else {
				count++;
			}
			temp=temp.next;
		}
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Linkedlistnode<Integer> head=Linkedlistuse.takeinput();
     ReturnElement(head, 5);
     Linkedlistuse.print(head);
	}

}
