package lecLinkedlist;

public class Element_recursively {
    public static int  indexOfNRec(Linkedlistnode<Integer> head, int n,int index) {
    	if(head==null) {
    		return(-1);
    	} 
    	if((int)head.data==n) {
    		return index+1;
    	}
    	else {
    		return indexOfNRec(head.next, n, index+1);
    	}
    	
    	
    }
	public static void main(String[] args) {
		Linkedlistnode<Integer> head= Linkedlistuse.takeinput();
		int index=indexOfNRec(head,5,-1);
		System.out.println(index);

	}

}
