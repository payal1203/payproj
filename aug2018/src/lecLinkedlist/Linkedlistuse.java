package lecLinkedlist;

import java.util.Scanner;

public class Linkedlistuse {
    public static void print(Linkedlistnode<Integer> head)
    {
    	Linkedlistnode<Integer>temp=head;
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
    public static Linkedlistnode<Integer> takeinput(){
    	Scanner s =new Scanner(System.in);
    	Linkedlistnode<Integer> head=null;
    	Linkedlistnode<Integer> tail=null;
    	int data=s.nextInt();
    	while(data!=-1) {
    		Linkedlistnode<Integer> newNode=new Linkedlistnode<Integer>(data);
    		if(head==null) {
    			head=newNode;
    			tail=newNode;
    		}
    		else {
    			tail.next=newNode;
    			tail=newNode;
    			/*Linkedlistnode<Integer> temp=head;
    			while(temp!=null) {
    				temp=temp.next;
    			}
    			temp.next=newNode;*/
    		}
    		data=s.nextInt();
    	}
    	return head; 
    }
    
    	public static void main(String[] args) {
        Linkedlistnode<Integer> head=takeinput();
        print(head);
    	}
		// TODO Auto-generated method stub

	

}
