package com.demo.lds.dataStructures;

import java.util.ArrayList;

public class CustomStack {
	
	
		static ArrayList<Integer> list= new ArrayList<Integer>();
		
		//Empty
		public  boolean isEmpty() {
			return list.size()==0;
		}
		
		//push
		public  void push(int data) {
			list.add(data);
		}
		
		//pop
		public  int pop() {
			if(isEmpty()) {
				return -1;	
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		//peek
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
		
		

	}
//	int[] stack;
//	int capacity;
//	int top;
//
//	public CustomStack() {
//		capacity = 10;
//		top = -1;
//		stack = new int[capacity];
//	}
//
//	public Boolean isEmpty() {
//		return top == -1;
//	}
//
//	public Boolean isFull() {
//		return top == capacity - 1;
//	}
//
//	public int push(int data) throws DataStructureException {
//		if (isFull()) {
//			throw new DataStructureException("Stack is Full");
//			// System.out.println("Stack is Full");
//		} else {
//			return stack[++top] = data;
//		}
//
//	}
//
//	public int pop() throws DataStructureException {
//		if (isEmpty()) {
//			throw new DataStructureException("Stack is Empty");
//			// System.out.println("Stack is Empty");
//		} else {
//			return stack[top--];
//		}
//
//	}
//
//	public int peek() {
//		if (isEmpty()) {
//			System.out.println("stack is Empty");
//		}
//		return stack[top];
//	}
//
//	public void show() {
//		if (isEmpty()) {
//			System.out.println("Stack is Empty");
//
//		}
//
//	}


