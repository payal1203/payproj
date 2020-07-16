package lecLinkedlist;

public class SortevenoddLL {
    public static Linkedlistnode<Integer> sortEvenOdd(Linkedlistnode<Integer> head){
    	Linkedlistnode<Integer> oddh=null;
    	Linkedlistnode<Integer> oddt=null;
    	Linkedlistnode<Integer> evenh=null;
    	Linkedlistnode<Integer> event=null;
    	while(head!=null) {
    	if((int)(head.data)%2!=0) {
    		if(oddh==null&& oddt==null) {
    			oddh=oddt=head;
    		}
    		else {
    			oddt.next=head;
    			oddt=head;
    		}
    	}
    	else {
    		if(evenh==null && event==null) {
    			evenh=event=head;
    		}
    		else {
    			event.next=head;
    			event=head;
    		}
    	}
    	head=head.next;
    	}
    	if(oddh==null) {
    		event.next=null;
    		return evenh;
    	}
    	else if(evenh==null) {
    		oddt.next=null;
    		return oddh;
    	}
    	else {
    	oddt.next=null;
    	event.next=null;
    	oddt.next=evenh;
    	return oddh;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlistnode<Integer> head=Linkedlistuse.takeinput();
		
	     sortEvenOdd(head);
	     Linkedlistuse.print(head);
	}

}
