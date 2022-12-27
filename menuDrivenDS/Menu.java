package menuDrivenDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Menu extends MenuItem {

	private List<MenuItem> items = new ArrayList<>();
	private static boolean isLevelOne = true;

	// TODO: create objects of Stack, Queue, Array

	public Menu(int order, String name) {
		super(order, name);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public Menu(String title) {
		super(0, title);
	}

	public void addMenuItem(MenuItem mi) {
		mi.setParent(this);
		items.add(mi);
	}

	public List<MenuItem> getMenuItems() {
		return items;
	}

	public void display() {
		if (isLevelOne) {
			isLevelOne = false;
			items.forEach(item -> item.display());
			isLevelOne = true;
			System.out.println("Enter your choice:");
			int choice = new Scanner(System.in).nextInt();

			if (choice == 0) {
				back();
			} else {
				MenuItem mi = getMenuItems().stream().filter(menuItem -> menuItem.getOrder() == choice).findFirst()
						.orElse(null);
				if (mi == null) {
					System.err.println("Invalid choice");
					display();
				} else if (mi instanceof Menu) {
					mi.display();
				} else {
					String operationName = mi.getName();
					String dataStructureName = mi.getParent().getName();

					switch (dataStructureName) {
						case "Stack":
							callStackOperation(operationName);
	
						case "Queue":
							callQueueOperation(operationName);

					}
				}

			}
		} else {
			super.display();
		}

	}

	private void callQueueOperation(String operationName) {
		// TODO Auto-generated method stub

	}

	private void callStackOperation(String operationName) {
		switch (operationName) {
		case "PUSH":
			System.out.println("Enter data:");
			int data = new Scanner(System.in).nextInt();
			DsDemoApp.stack.push(data);
			back();
			break;
		case "POP":
			System.out.println("Enter data:");
			 data = new Scanner(System.in).nextInt();
			DsDemoApp.stack.push(data);
			back();
			break;
		case "PEAK":
			System.out.println("Enter data:");
			 data = new Scanner(System.in).nextInt();
			DsDemoApp.stack.push(data);
			back();
			break;
		case "Empty":
			System.out.println("Enter data:");
			 data = new Scanner(System.in).nextInt();
			DsDemoApp.stack.push(data);
			back();
			break;	
		}
	
	}

	public void back() {
		if (getParent() != null) {
			getParent().display();

		} else {
			System.exit(0);
		}

	}
//	public void displayOld() {
//		int choice = 0;
//		
//		
//		
//		stackItems.add(new MenuItem(1,"Add Elements into Stack:"));
//		stackItems.add(new MenuItem(2,"Check the stack, empty or not:"));
//		stackItems.add(new MenuItem(3,"Remove Element from Stack:"));
//		stackItems.add(new MenuItem(4,"Top Element in the Stack:"));
//		
//		queueItems.add(new MenuItem(1,"Add Elements into Queue:"));
//		queueItems.add(new MenuItem(2,"Check the Queue, empty or not:"));
//		queueItems.add(new MenuItem(3,"Remove Element from Queue:"));
//		queueItems.add(new MenuItem(4,"Top Element in the Queue:"));
//		
//		arrayItems.add(new MenuItem(1,"Add Elements into Array:"));
//		arrayItems.add(new MenuItem(2,"Display all Elements:"));
//		arrayItems.add(new MenuItem(3,"Resize the elements:"));
//		
//		linkedListItems.add(new MenuItem(1, "Add Elements to Linked List:"));
//		linkedListItems.add(new MenuItem(2, "Display Linked List:"));
//		
//		//TODO:Add Menu Items to new Menu's created
//		
//		do {
//
//			System.out.println(getName());
//			for (MenuItem mi : getMenuItems()) {
//				System.out.println(mi.getOrder() + "." + mi.getName());
//			}
//			System.out.println("Enter the choice of Data Structure:");
//			choice = sc.nextInt();
//			
//			switch(choice)
//			{
//			   case 1: displayStackMenu();
//			   break;
//			   case 2:displayQueueMenu();
//			   break;
//			   case 3:displayArrayMenu();
//			   break;
//			   case 4 :displayLinkedListMenu();
//			   break;
//			   case 5: System.out.println("Enter 5 to Exit!!");
//			   break;
//			   default: System.out.println("Enter valid choice!!");
//			}
//
//		} while (choice != (getMenuItems().size() + 1));
//
//	}
//	
//	//TODO: add new display functions for Stack, Queue and dynamic array
//	public void displayStackMenu() {
//		
//		int choice=0;
//		
//		do {
//			
//			System.out.println("Stack Sub Menu: ");
//			for(MenuItem mi:getStackItems()) {
//				System.out.println(mi.getOrder()+ " . "+ mi.getName());
//			}
//			System.out.println("Please Enter Your Choice:");
//			choice=sc.nextInt();
//			
//			switch(choice) {
//			case 1: {
//				System.out.println("Enter an Elements into Stack: ");
//				int data = sc.nextInt();
//				stack.push(data);
//				
//				System.out.println("Elements added successfully");
//			}
//			break;
//			case 2:{
//				System.out.println("Stack is empty: "+stack.isEmpty());
//			}
//			break;
//			case 3:{
//				
//				System.out.println("Element deleted successfully: "+stack.pop());
//			}
//			break;
//			case 4:{
//				System.out.println("Top Element of the stack : " + stack.peek());
//				
//			}
//			break;
//			case 5:{
//				System.out.println("Enter 5 to exit!!");
//			}
//			break;	
//		    default: System.out.println("Enter valid Stack Menu!!");
//			break;
//			}
//			
//		}while(choice!=(getStackItems().size()+1) );
//		
//	}
//	
//	public void displayQueueMenu() {
//		
//		int choice=0;
//		do {
//			System.out.println("Queue Sub Menu:");
//			for(MenuItem mi: getQueueItems()) {
//				System.out.println(mi.getOrder() + ". "+ mi.getName());
//			}
//			System.out.println("Please Enter Your Choice ");
//			choice= sc.nextInt();
//			switch(choice) {
//			case 1: {
//				System.out.println("Enter an element into Queue: ");
//				int data= sc.nextInt();
//				queue.enqueue(data);
//				System.out.println("Element added successfully: ");
//			}
//			break;
//			case 2:{
//				System.out.println("Queue is empty: "+queue.isEmpty());
//			}
//			break;
//			case 3:{
//				System.out.println("Element deleted successfully: "+ queue.dequeue());
//				}
//			break;
//			case 4:{
//				System.out.println("Top Element of the queue : "+ queue.peak());
//			}
//			break;
//			case 5:{
//				System.out.println("Enter 5 to exit!!");
//			}
//			default:
//			    System.out.println("Enter valid Queue Menu!!");
//			}
//			
//		}while(choice!=(getQueueItems().size()+1));
//		
//	}
//	
//	
//	public void displayArrayMenu() {
//		
//		int choice=0;
//		do {
//		System.out.println("Array sub menu:");
//		for(MenuItem mi: getArrayItems()) {
//			System.out.println(mi.getOrder()+ "."+ mi.getName());
//		}
//		System.out.println("Please enter your choice:");
//		choice=sc.nextInt();
//		
//		switch(choice) {
//		case 1:{
//			System.out.println("Enter an element into Array");
//			int data=sc.nextInt();
//			array.add(data);
//			System.out.println("Elements are added successfully");
//		}
//		break;
//		case 2:{
//			array.display(); 
//		}
//		break;
//		case 3:{
//			System.out.println("Enter the size to extend Array");
//			int data=sc.nextInt();
//			array.resize(data);
//			System.out.println("Size exceeds an array");
//		}
//		break;
//		case 4:{
//			System.out.println("Enter 4 to exit!!");
//		}
//		break;
//		default: System.out.println("Enter valid Array Menu!!");
//			break;
//		}
//		}while(choice!= (getArrayItems().size()+1));
//		
//	}
//	
//	public void displayLinkedListMenu()
//	{
//		
//		int choice = 0;
//		
//		do {
//
//			System.out.println("Linked List Sub Menu: ");
//			for (MenuItem mi : getLinkedListItems()) {
//				System.out.println(mi.getOrder() + "." + mi.getName());
//			}
//			System.out.println("Please enter your choice : ");
//			choice = sc.nextInt();
//			
//			switch (choice) {
//				case 1:
//				{
//					System.out.println("Enter the element for new node : ");
//					int data = sc.nextInt();
//					linkedList.add(data);
//					System.out.println("Element added successfully");
//				}
//				break;
//
//				case 2:
//				{
//					System.out.println("Displaying Linked List");
//					linkedList.display();
//				}
//				break;
//				case 3:{
//					System.out.println("Enter 3 to exit!!");
//				}
//				break;	
//				default: System.out.println("Enter valid Linked List Menu!!");
//				break;
//			
//			}
//
//		} while (choice != (getLinkedListItems().size() + 1));
//	}
//	
//	public List<MenuItem> getStackItems(){
//		return stackItems;
//	}
//	public List<MenuItem> getQueueItems() {
//		return queueItems;
//	}
//	public List<MenuItem> getArrayItems() {
//		return arrayItems;
//	}
//	public List<MenuItem> getLinkedListItems() {
//		return linkedListItems;
//	}

}
