package assignment1;

public class Q_1_3_27  {
	Node head;
		
	public   Q_1_3_27() {
		
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
	
	
	public void max(Node p) {
		int max = p.val;
		
		while(p.next!=null) {
		max = max < p.next.val ? p.next.val : max;
		p=p.next;
			
		}
		
		System.out.println("Maximum number: " + max);
	}
	

	public static void main(String[] args) {
		
		Q_1_3_27 mylist= new Q_1_3_27();
	
		mylist.addElement(1);
		mylist.addElement(2);
		mylist.addElement(3);
		mylist.addElement(4); 
		mylist. prettyprint() ; ;
		mylist.max(mylist.head);

		

	}

}