package com.demo.lds.dataStructures;

public class CustomQueue {
	int arr[];
	int size;
	int rear=-1;
	
	public CustomQueue() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomQueue(int n){
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
	/*
	 * int front; int end; int capacity = 10; int[] object;
	 * 
	 * public CustomQueue() { front = -1; end = -1; object = new int[capacity]; }
	 * 
	 * public Boolean isEmpty() { return end <= front; }
	 * 
	 * public int enqueue(int data) { System.out.println("Enqueue Method Invoked");
	 * return object[++end] = data; }
	 * 
	 * public int dequeue() throws DataStructureException { if (isEmpty()) { throw
	 * new DataStructureException("Queue is Empty"); } //
	 * System.out.println("Queue is Empty");
	 * 
	 * if (end >= front) { return object[++front]; }
	 * 
	 * return (Integer) null; }
	 * 
	 * public int size() { return end - front; }
	 * 
	 * public int front() { if (isEmpty()) { System.out.println("Queue is Empty");
	 * 
	 * } return capacity; }
	 */

