package lecLinkedlist;

public class Insertion_LinkedList {
	public static Linkedlistnode<Integer> insert(Linkedlistnode<Integer> head,int data,int position){
		Linkedlistnode<Integer> ptr=head;
		Linkedlistnode<Integer> preptr=null;
		if(position>Length(head)) {
			return head;
		}
		if(position==0) {
			Linkedlistnode<Integer> newNode=new Linkedlistnode<Integer>(data);
			newNode.next=head;
			head=newNode;
		}
		else {
			int pos=0;
			while(pos!=position ) {
				pos++;
				preptr=ptr;
				ptr=ptr.next;
				/*while(pos<position-1){
				  pos++;
				  temp=temp.next;
				  }
				  
				 newNode.next=temp.next
				temp.next=newNode
				 
				
				*/
			}
			Linkedlistnode<Integer> newNode=new Linkedlistnode<Integer>(data);
			preptr.next=newNode;
			newNode.next=ptr;
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
		

	}

}
