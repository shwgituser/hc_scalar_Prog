package menuDrivenDS;



public class DsDemoApp {
	
	public static final Stack stack = new Stack();


	public static void main(String args[]) {

		Menu mainMenu = new Menu("List of Data Structures Menu:");
		Menu arrayMenu = new Menu(1, "Array");
		Menu stackMenu = new Menu(2, "Stack");
		Menu queueMenu = new Menu(3, "Queue");
		Menu linkedListMenu = new Menu(4, "Linked list");

		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(arrayMenu);
		mainMenu.addMenuItem(linkedListMenu);

		stackMenu.addMenuItem(new MenuItem(1, "PUSH"));
		stackMenu.addMenuItem(new MenuItem(2, "CHECK IS EMPTY"));
		stackMenu.addMenuItem(new MenuItem(3, "POP"));
		stackMenu.addMenuItem(new MenuItem(4, "PEAK"));

		queueMenu.addMenuItem(new MenuItem(1, "Add Elements into Queue:"));
		queueMenu.addMenuItem(new MenuItem(2, "Check the Queue, empty or not:"));
		queueMenu.addMenuItem(new MenuItem(3, "Remove Element from Queue:"));
		queueMenu.addMenuItem(new MenuItem(4, "Top Element in the Queue:"));

		arrayMenu.addMenuItem(new MenuItem(1, "Add Elements into Array:"));
		arrayMenu.addMenuItem(new MenuItem(2, "Display all Elements:"));
		arrayMenu.addMenuItem(new MenuItem(3, "Resize the elements:"));

		linkedListMenu.addMenuItem(new MenuItem(1, "Add Elements to Linked List:"));
		linkedListMenu.addMenuItem(new MenuItem(2, "Display Linked List:"));
		
		mainMenu.display();

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the choice of menu:");
//		int choice = sc.nextInt();
//		
//		store.get(choice).display();

	}

}
