package priorityqueues_lec;

import java.util.ArrayList;
class PriorityQueueException extends Exception {
	
}
public class MinPriorityQueue {
	private ArrayList<Integer> heap;
	
	public MinPriorityQueue() {
		heap=new ArrayList<>();
	}
	
	public boolean isempty() {
		return heap.size()==0;
	}
	public void insert(int element) {

		heap.add(element);
		int childindex=heap.size()-1;
		int parentindex=(childindex-1)/2;
		while(childindex>0) {
			if(heap.get(childindex)<heap.get(parentindex)) {
				int temp=heap.get(childindex);
				heap.set(0, heap.get(parentindex));
				heap.set(parentindex, temp);
				childindex=parentindex;
				parentindex=(childindex-1)/2;
			}
			else {
				break;
			}
		}
	}
	public int getmin() throws PriorityQueueException{
      if(isempty()) {
    	  throw new PriorityQueueException();
      }
		return heap.get(0);
	}
	
	public int removemin() throws PriorityQueueException {
		if(isempty()) {
	    	  throw new PriorityQueueException();
	      }
		int retval=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		if(heap.size()>1) {
			downheapify(0);
		}
		return retval;
	}
	private void downheapify(int i) {
		int leftchildindex=2*i+1;
		int rightchildindex=2*i+2;
		if(leftchildindex>=heap.size()) {
			return;
		}
		int minindex=i;
		 if(heap.get(leftchildindex)<heap.get(minindex)) {
			 minindex=leftchildindex;
		 }
		 if(heap.get(rightchildindex)<heap.get(minindex)) {
			 minindex=rightchildindex;
		 }
		 if(minindex!=i) {
			 int temp=heap.get(i);
			 heap.set(i,heap.get(minindex));
			 heap.set(minindex, temp);
			 downheapify(minindex);
		 }
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
