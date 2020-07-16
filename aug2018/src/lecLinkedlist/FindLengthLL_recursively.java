package lecLinkedlist;

public class FindLengthLL_recursively {
	public static int Lengthrecursive(Linkedlistnode<Integer> head) {
		if(head==null) {
			return 0;
		}
		int result=Lengthrecursive(head.next);
		return 1+result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
