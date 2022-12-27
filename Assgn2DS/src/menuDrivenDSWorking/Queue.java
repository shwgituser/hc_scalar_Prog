package menuDrivenDS;

public class Queue {
	static int arr[];
	static int size;
	static int rear=-1;
	
	Queue(int n){
		arr=new int[n];
		this.size=n;
		
	}
	
	
	
	
	//Empty
	public static boolean isEmpty() {
		return rear==-1;
	}
	
	//Adding operation
	public static void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("Queue is already full!");
		}
		rear++;
		arr[rear]=data;
	}
	
	//Delete Operation
	public static int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		    return -1;
		}
		int front=arr[0];
		for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
			
		}
		rear--;
		return front;
		}
	
	
	//peak
	public static int peak() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		    return -1;
		}
		return arr[0];
		}
	
	public static void main(String args[]) {
		Queue queue=new Queue(7);
		
		Queue.enqueue(1);
		Queue.enqueue(2);
		Queue.enqueue(3);
		Queue.enqueue(4);
		Queue.enqueue(5);
		Queue.enqueue(6);
		Queue.enqueue(7);
		
		while(!Queue.isEmpty()) {
			System.out.println(Queue.peak());
			Queue.dequeue();
		}
	}

}
