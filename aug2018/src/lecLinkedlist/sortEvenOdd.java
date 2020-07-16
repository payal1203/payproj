package lecLinkedlist;

public class sortEvenOdd {
	public static Linkedlistnode<Integer> sortEvenOdd(Linkedlistnode<Integer> head){
		int count=0;
		Linkedlistnode<Integer>temp=head;
		Linkedlistnode<Integer> odd=head;
		Linkedlistnode<Integer> even=head;
		Linkedlistnode<Integer> tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		while(count<Length(head)) {
			System.out.println("in");
			if((int)temp.data%2==0) {
				System.out.println("print");
				even=temp;
				odd.next=odd.next.next;
				tail.next=even;
				tail.next.next=null;
				tail=tail.next;
			}
			else {
				odd=temp;
				temp=temp.next;
			}
			count++;
			System.out.println("hello"+count);
			
		System.out.println("infinite");
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
		// TODO Auto-generated method stub
		Linkedlistnode<Integer> head=Linkedlistuse.takeinput();
		System.out.println("length"+Length(head));
	     sortEvenOdd(head);
	     Linkedlistuse.print(head);
	}

}
