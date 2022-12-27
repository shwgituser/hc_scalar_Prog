package com.demo.lds.dataStructures;

import java.util.Scanner;
import java.util.TreeMap;

import com.demo.lds.menu.DataStructureStore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Menu extends MenuItem {

	// private List<MenuItem> item = new ArrayList<MenuItem>();
	@JsonManagedReference
	private TreeMap<Integer, MenuItem> items = new TreeMap<>();
	@JsonIgnore
	private static boolean isLevelOne = true;

	public Menu(String title) {
		super(0, title);
	}

	public Menu() {
		super();
	}

	public Menu(int order, String title) {
		super(order, title);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public void addMenuItem(MenuItem mi) {
		mi.setParent(this);
		items.put(mi.getOrder(), mi);
	}

	public TreeMap<Integer, MenuItem> getItems() {
		return items;
	}
//	public TreeSet<MenuItem> getMenuItem() {
//		return item;
//	}

	public void setItems(TreeMap<Integer, MenuItem> items) {
		this.items = items;
	}

	public void display() {
		if (isLevelOne) {
			isLevelOne = false;
			items.values().forEach(item -> item.display());
			isLevelOne = true;
			System.out.println("Enter your choice:");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 0) {
				goBack();
			} else {
//				MenuItem mi = getMenuItem().stream().filter(menuItem -> menuItem.getOrder() == choice).findFirst()
//						.orElse(null);
				MenuItem mi = items.get(choice);
				if (mi == null) {
					System.out.println("Invalid choice");
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

					case "Array":
						callArrayOperation(operationName);
					}

				}
			}

		} else {
			super.display();
		}

	}

	private void callArrayOperation(String operationName) {
		switch (operationName) {
		case "insert":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			DataStructureStore.getInstance().getArray().add(data);
			back();
			break;

		case "display":
			try {
				DataStructureStore.getInstance().getArray().display();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			back();
			break;
		}
	}

	private void callStackOperation(String operationName) {
		switch (operationName) {
		case "push()":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			try {
				DataStructureStore.getInstance().getStack().push(data);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

			back();
			break;

		case "pop()":
			System.out.println("element popped: " + DataStructureStore.getInstance().getStack().pop());
			back();
			break;

		case "peek()":
			try {
				System.out.println("Top Element: " + DataStructureStore.getInstance().getStack().peek());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

			back();
			break;

		}

	}

	private void callQueueOperation(String operationName) {
		switch (operationName) {
		case "enqueue()":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			try {
				DataStructureStore.getInstance().getQueue().enqueue(data);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

			back();
			break;

		case "dequeue()":
			try {
				System.out.println("element popped: " + DataStructureStore.getInstance().getQueue().dequeue());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			back();
			break;

		case "front()":
			System.out.println("Top Element: " + DataStructureStore.getInstance().getQueue().peak());
			back();
			break;

		}

	}

	private void callLinkedListOperation(String operationName) {
		switch (operationName) {
		case "Add()":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			DataStructureStore.getInstance().getLinkedList().add(data);
			back();
			break;

		case "delete()":
			//DataStructureStore.getInstance().getLinkedList().;
			back();
			break;

		case "Traverse()":
			DataStructureStore.getInstance().getLinkedList().display();
			back();
			break;

		}

	}

	public void goBack() {
		if (getParent() != null) {
			getParent().display();

		} else {
			System.exit(0);
		}

	}
}
