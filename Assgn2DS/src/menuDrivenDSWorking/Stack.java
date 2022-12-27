package menuDrivenDS;

import java.util.ArrayList;

public class Stack {
	static ArrayList<Integer> list= new ArrayList<Integer>();
	
	//Empty
	public static boolean isEmpty() {
		return list.size()==0;
	}
	
	//push
	public static void push(int data) {
		list.add(data);
	}
	
	//pop
	public static int pop() {
		if(isEmpty()) {
			return -1;	
		}
		int top=list.get(list.size()-1);
		list.remove(list.size()-1);
		return top;
	}
	
	//peek
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		return list.get(list.size()-1);
	}
	
	public static void main(String args[]) {
		//StackOperations stack= new StackOperations();
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		Stack.push(4);
		Stack.push(5);
		Stack.push(6);
		Stack.push(7);
		while(!isEmpty()) {
			System.out.println(Stack.peek());
			Stack.pop();
		}
	}

}
