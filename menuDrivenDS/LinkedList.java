package menuDrivenDS;



public class LinkedList {
	
	LinkedListNode head = null;
	LinkedListNode tail = null;

	void add(int data)
	{
		LinkedListNode newNode = new LinkedListNode(data);
		if(head == null)
		{
			head = newNode;
			tail = head;
		}
		else
		{
			tail.next = newNode;
			tail = tail.next;
		}
		tail.next = null;
	}
	
	void display()
	{
		System.out.println();
		LinkedListNode tmp = head;
		while(tmp != null)
		{
			System.out.print(tmp.data);
			System.out.print("->");
			tmp = tmp.next;
		}
		System.err.print("N");
	}

}



