package humanCloundScalerProgram.assignments15_12_23;


public class Node {
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
	
	public void printlist(Node head)
	{
		while(head != null)
			{
				System.out.print(head.data);
				System.out.print("->");
				head = head.next;
			}
			System.out.print("null");
			
		}
	
	
	public void insert(Node newnode, Node after ,Node head)
	{
		Node temp=after.next;
		after.next=newnode;
		newnode.next=temp;
	}
		
	public void iterate(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void delete(Node head,Node remove) {
		Node temp= head;
		while(temp.next != remove) {
			temp=temp.next;
			}
		temp.next=remove.next;
	}
	
   public int get(int getnode,Node head) {
	   int count=0;
	   Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			if(count==getnode) {
				break;
			}
			else
			{
				count++;
			}
		}
	   
		return temp.data;
	}

	public static void main(String args[])
	{
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n3 = new Node(3);
		Node dummy = n0;
		
		n0.next = n1;
		n1.next = n3;
		n3.next = null;
		
		System.out.println("Print List Method Invoked: ");
		dummy.printlist(n0);
		
		Node n2 = new Node(2);
		dummy.insert(n2, n1, n0);
		System.out.println("   ");
		System.out.println("Insert Method Invoked: ");
		dummy.printlist(n0);
		System.out.println("   ");
		System.out.println("Iterate Method Invoked: ");
		dummy.iterate(n0);
		System.out.println("   ");
		System.out.print("Original linkedlist: ");
		dummy.iterate(n0);
		System.out.println("   ");
		System.out.println("Delete Method Invoked:");
		dummy.delete(n0,n3);
		dummy.iterate(n0);
		System.out.println("   ");
		System.out.println("Get Method Invoked: "+ dummy.get(1,n0));
		
		
	}

}



