package menuDrivenDS;



public class DsDemoApp {
	public static void main(String args[]) {
		Menu mainMenu=new Menu("List of Data Structures Menu:");
		mainMenu.addMenuItem(new MenuItems(1, "Stack"));
		mainMenu.addMenuItem(new MenuItems(2, "Queue"));
		mainMenu.addMenuItem(new MenuItems(3, "Array"));
		mainMenu.addMenuItem(new MenuItems(4, "LinkList"));
		
		mainMenu.display();
		
	}

}
