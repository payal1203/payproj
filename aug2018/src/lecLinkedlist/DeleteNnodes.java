package lecLinkedlist;

public class DeleteNnodes {
	public static Linkedlistnode<Integer> skipMdeleteN(Linkedlistnode<Integer> head, int M, int N){
		Linkedlistnode<Integer> temp1=head;
		Linkedlistnode<Integer> temp2=temp1;
		int count1=1;
		int count2=0;
		
		while( temp1!=null && temp2!=null) {
			
			while(count1!=M && temp1!=null) {
				temp1=temp1.next;
				count1++;
			}
			temp2=temp1;
			while(count2!=(N+1)&& temp2!=null) {
				temp2=temp2.next;
				count2++;
				temp1.next=temp2;
			}
			
			count1=0;
			count2=0;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlistnode<Integer> head=Linkedlistuse.takeinput();
	     skipMdeleteN(head, 2, 2);
	     Linkedlistuse.print(head);
	}

}
