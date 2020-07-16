package lecLinkedlist;

public class MergeTwoLL {
	public static Linkedlistnode<Integer> Merge2ll(Linkedlistnode<Integer> head1,Linkedlistnode<Integer> head2){
		Linkedlistnode<Integer> head3;
		if(head1==null && head2==null) {
			return null;
		}
		else if(head1==null &&head2!=null){
			return head2;
		}
		else if(head1!=null && head2==null) {
			return head1;
		}
		else {
			Linkedlistnode<Integer> temp1=head1;
			Linkedlistnode<Integer> temp2=head2;
			Linkedlistnode<Integer> tail;
			if(head1.data<head2.data) {
				head3=head1;
				tail=head1;
				temp1=temp1.next;
			}
			else {
				head3=head2;
				tail=head2;
				temp2=temp2.next;
			}
			while(temp1!=null && temp2!=null) {
				if(temp1.data<temp2.data) {
					tail.next=temp1;
					tail=temp1;
					temp1=temp1.next;
				}
				else {
					tail.next=temp2;
					tail=temp2;
					temp2=temp2.next;
				}
			}
			if(temp1==null) {
				tail.next=temp2; 
			}
			else {
				tail.next=temp1;
			}
		}
		return head3;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
