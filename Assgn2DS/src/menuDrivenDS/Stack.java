package menuDrivenDS;

import java.util.ArrayList;

public class Stack {
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
