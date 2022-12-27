package com.demo.lds.menu;

import com.demo.lds.dataStructures.Menu;
import com.demo.lds.dataStructures.MenuItem;

public class DataStructureMenuStore {

	private static DataStructureMenuStore INSTANCE;
	private Menu mainMenu;
	private Menu stackMenu;
	private Menu arrayMenu;
	private Menu linkedListMenu;
	private Menu queueMenu;

	private DataStructureMenuStore() {
		configureMenu();
	}

	public static DataStructureMenuStore getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DataStructureMenuStore();
		}
		return INSTANCE;
	}

	public Menu getMainMenu() {
		return mainMenu;
	}

	public Menu getStackMenu() {
		return stackMenu;
	}

	public Menu getQueueMenu() {
		return queueMenu;
	}

	public Menu getLinkedListMenu() {
		return linkedListMenu;
	}

	public Menu getArrayMenu() {
		return arrayMenu;
	}

	private void configureMenu() {
		mainMenu = new Menu("Data Structures");
		// Menu arrayMenu = new Menu(1, "Array");
		stackMenu = new Menu(2, "Stack");
		arrayMenu = new Menu(1, "Array");
		linkedListMenu = new Menu(4, "Linkedlist");
		queueMenu = new Menu(3, "Queue");

		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(arrayMenu);
		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(linkedListMenu);

		arrayMenu.addMenuItem(new MenuItem(1, "insert"));
		arrayMenu.addMenuItem(new MenuItem(2, "display"));

		stackMenu.addMenuItem(new MenuItem(1, "push()"));
		stackMenu.addMenuItem(new MenuItem(2, "pop()"));
		stackMenu.addMenuItem(new MenuItem(3, "peek()"));

		linkedListMenu.addMenuItem(new MenuItem(1, "Add()"));
		linkedListMenu.addMenuItem(new MenuItem(2, "Delete()"));
		linkedListMenu.addMenuItem(new MenuItem(3, "Traverse()"));
		linkedListMenu.addMenuItem(new MenuItem(4, "Display()"));

		queueMenu.addMenuItem(new MenuItem(1, "enqueue()"));
		queueMenu.addMenuItem(new MenuItem(2, "dequeue()"));
		queueMenu.addMenuItem(new MenuItem(3, "front()"));
	}

}
