package menuDrivenDS;

public class DsDemoApp {

	public static final Stack stack = new Stack();
	public static final Queue queue = new Queue(5);
	public static final Array array = new Array(5);
	public static final LinkedList linkedList = new LinkedList();

	public static void main(String args[]) {

		Menu mainMenu = new Menu("List of Data Structures Menu:");
		Menu stackMenu = new Menu(1, "Stack");
		Menu queueMenu = new Menu(2, "Queue");
		Menu arrayMenu = new Menu(3, "Array");
		Menu linkedListMenu = new Menu(4, "Linked list");

		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(arrayMenu);
		mainMenu.addMenuItem(linkedListMenu);

		stackMenu.addMenuItem(new MenuItem(1, "Push"));
		stackMenu.addMenuItem(new MenuItem(2, "IsEmpty"));
		stackMenu.addMenuItem(new MenuItem(3, "Pop"));
		stackMenu.addMenuItem(new MenuItem(4, "Peak"));

		queueMenu.addMenuItem(new MenuItem(1, "Enqueue"));
		queueMenu.addMenuItem(new MenuItem(2, "IsEmpty"));
		queueMenu.addMenuItem(new MenuItem(3, "Dequeue"));
		queueMenu.addMenuItem(new MenuItem(4, "Peak"));

		arrayMenu.addMenuItem(new MenuItem(1, "Add"));
		arrayMenu.addMenuItem(new MenuItem(2, "Display Array"));
		arrayMenu.addMenuItem(new MenuItem(3, "Resize"));

		linkedListMenu.addMenuItem(new MenuItem(1, "Add"));
		linkedListMenu.addMenuItem(new MenuItem(2, "DisplayLL"));

		mainMenu.display();

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the choice of menu:");
//		int choice = sc.nextInt();
//		
//		store.get(choice).display();

	}

}
