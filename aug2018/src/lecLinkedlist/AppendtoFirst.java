package lecLinkedlist;

public class AppendtoFirst {
	public static Linkedlistnode<Integer> append(Linkedlistnode<Integer> root, int n){
		Linkedlistnode<Integer> temp=root;
    	for(int j=0;j<n;j++) {
    		temp=temp.next;
    	}
    	Linkedlistnode<Integer> slow=root;
    	Linkedlistnode<Integer> pre = null;
    	Linkedlistnode<Integer> tem=null;
    	while(temp.next!=null) {
    		temp=temp.next;
    		pre=slow;
    		slow=slow.next;
    	}
    	pre.next=pre.next.next;
    	slow.next=root;
    	root=slow;
    	tem=root;
    	for(int i=1;i<n;i++) {
    		if(pre.next!=null) {
    		slow=pre.next;
    		pre.next=pre.next.next;
        	
        	slow.next=tem.next;
        	tem.next=slow;
        	tem=tem.next;}
        	
    	}
    	return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
