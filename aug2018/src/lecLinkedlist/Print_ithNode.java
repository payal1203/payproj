package lecLinkedlist;

public class Print_ithNode {
    public static void printIth(Linkedlistnode<Integer> head,int position) {
    	Linkedlistnode<Integer> temp=head;
    	int pos=-1;
    	while(temp!=null) {
    		pos++;
    		if(pos==position) {
    			System.out.println(temp.data);
    		}
    		else {
    			temp=temp.next;
    		}
    		
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
