package menuDrivenDS;



public class LinkedList {
	int data;
	LinkedList next;
	LinkedList(int d)
	{
		data = d;
	}
	
	public void printlist(LinkedList head)
	{
		while(head != null)
			{
				System.out.print(head.data);
				System.out.print("->");
				head = head.next;
			}
			System.out.print("null");
			
		}
	
	
	public void insert(LinkedList newnode, LinkedList after ,LinkedList head)
	{
		LinkedList temp=after.next;
		after.next=newnode;
		newnode.next=temp;
	}
		
	public void iterate(LinkedList head) {
		LinkedList temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void delete(LinkedList head,LinkedList remove) {
		LinkedList temp= head;
		while(temp.next != remove) {
			temp=temp.next;
			}
		temp.next=remove.next;
	}
	
   public int get(int getnode,LinkedList head) {
	   int count=0;
	   LinkedList temp=head;
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
		LinkedList n0 = new LinkedList(0);
		LinkedList n1 = new LinkedList(1);
		LinkedList n3 = new LinkedList(3);
		LinkedList dummy = n0;
		
		n0.next = n1;
		n1.next = n3;
		n3.next = null;
		
		System.out.println("Print List Method Invoked: ");
		dummy.printlist(n0);
		
		LinkedList n2 = new LinkedList(2);
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



