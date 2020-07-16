package lecQueue;

public class Queue {
private int[] data;
private int front;
private int rear;
private int size;

public Queue() {
	data=new int[5];
	front=-1;
	rear=-1;
	size=0;
}
public Queue(int capacity) {
	data =new int[capacity];
	front=-1;
	rear=-1;
	size=0;
}
public int getsize() {
	return size;
}
public boolean isempty() {
	return (getsize()==0);
	
}
public boolean isfull() {
	return(getsize()==data.length);
}
public void enqueue(int element) {
	if(isfull()) {
		return;
		//throw some error
	}
	if(front==-1) {
		front=0;
	}
	rear=(rear+1)%(data.length);
	data[rear]=element;
	size++;
	
}
public int dequeue() {
	if(isempty()) {
		return size;
		//throw some error
	}
	int val=data[front];
	front=(front+1)%(data.length);
	size--;
	if(size==0) {
		front=-1;
		rear=-1;
	}
	return val;
	
}
public int front() {
	if(isempty()) {
		return size;
	}
	int val=data[front];
	return val;
}

}


