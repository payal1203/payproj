package lecStack;

public class Stack {
	private int[] data;
    private int top;
    
    public Stack() {
    	data= new int[5];
    	top=-1;
    }
    public Stack(int capacity) {
    	data=new int[capacity];
    	top=-1;
    }
    public int getsize() {
    	return top+1;
    }
    public boolean isfull() {
    	return getsize()==data.length;
    }
    public boolean isempty() {
    	return getsize()==0;
    }
    public void push(int element) {
    	if(isfull()) {
    		//throw some error
    		return;
    	}
    	top++;
    	data[top]=element;
    }
    public int peek() {
    	if(isempty()) {
    		return top;
    		//throw some error
    	}
    	return data[top];
    }
    public int pop() {
    	if(isempty()) {
    		return top;
    		//throw some error 
    	}
    	int val=data[top];
    	top--;
    	return val;
    }
    
}
