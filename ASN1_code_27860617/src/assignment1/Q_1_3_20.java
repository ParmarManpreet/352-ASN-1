package assignment1;

import java.util.Scanner;

public class Q_1_3_20  {
	Node head;
	
	
	public   Q_1_3_20() {
		
		head=null;
	}
	
	
	public  void addElement(int numb) {
		Node current= head;
		if( head== null) {
			
			head= new Node(numb);
			
		}else {
			
			Node node = new Node (numb);
			node.next=head;
			head= node;
			
		}
	}
	
	
	public void prettyprint() {
		
		Node current= head;
		while(current!= null) {
			System.out.print(current.val + " ");
			current= current.next;
		}	
		System.out.println("");
	}
	
	
	public void delete(int index) {
		Node curr= head;
		int count=0;
		int ind=index-1;
		
		while(curr !=null) {
			
			if(count ==ind) {
				curr.next=curr.next.next;
				return;
			}else {
				count++;
				curr=curr.next;
			}
			
		}		
			
		}
	

	public static void main(String[] args) {
		
		Q_1_3_20 mylist= new Q_1_3_20();
		mylist.addElement(1);
		mylist.addElement(2);
		mylist.addElement(3);
		mylist.addElement(4); 
		mylist. prettyprint() ; 
	
		//pick index = 3 to delete 3rd element. 3 is the Kth value
		mylist.delete(2);
		mylist. prettyprint() ;

		

	}

}