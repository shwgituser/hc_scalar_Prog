package menuDrivenDS;

public class Queue {
	int arr[];
	int size;
	int rear=-1;
	
	public Queue() {
		// TODO Auto-generated constructor stub
	}
	
	Queue(int n){
		arr=new int[n];
		this.size=n;
		
	}
	
	//Empty
	public  boolean isEmpty() {
		return rear==-1;
	}
	
	//Adding operation
	public  void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("Queue is already full!");
		}
		rear++;
		arr[rear]=data;
	}
	
	//Delete Operation
	public  int dequeue() {
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
	public  int peak() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		    return -1;
		}
		return arr[0];
		}
	
	
	

}
