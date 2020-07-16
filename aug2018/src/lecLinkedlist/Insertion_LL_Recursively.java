package lecLinkedlist;

public class Insertion_LL_Recursively {
	public static Linkedlistnode<Integer> InsertRec(Linkedlistnode<Integer> head,int data,int pos){
		if(head==null) {
			if(pos==0) {
				Linkedlistnode<Integer> newNode=new Linkedlistnode<Integer>(data);
				head=newNode;
			}
			return head;
		}
		if(pos==0) {
			Linkedlistnode<Integer> newNode=new Linkedlistnode<Integer>(data);
			newNode.next=head;
			head=newNode;
			return newNode;
		}
		
		 head.next=InsertRec(head.next, data, pos-1);
		 return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
