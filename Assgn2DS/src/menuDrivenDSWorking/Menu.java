package menuDrivenDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItems{
	private List<MenuItems> items=new ArrayList<>();
 
	public Menu(int order,String name) {
		super(order,name);
		// TODO Auto-generated constructor stub
	}
	
	public Menu(String title) {
		super(0,title);
	}
	
	public void addMenuItems(MenuItems mi) {
		items.add(mi);
	}
	
	public List<MenuItems> getMenuItems(){
		return items;
	}
	
	
	public void display() {
		
		 
		Scanner sc= new Scanner(System.in);
		
		int choice=0;
		 
		 do {
		
			 System.out.println(getName());
			 for(MenuItems mi: getMenuItems()) {
				  System.out.println(mi.getOrder()+ "."+mi.getName());
			 }
			 System.out.println("Enter the choice of Data Structure:");
			 choice=sc.nextInt();
			 
				  System.out.println();
				  
				  switch (choice) { 
				  case 1:
				  {
					  System.out.println("Your choice is Stack");
				     
					  int subchoice = 0;
					do {
						System.out.println("Below is the List of Stack Operations:");
						System.out.println("1. Push");
						System.out.println("2. Pop");
						System.out.println("3. Peek");
						System.out.println("Enter 4 to exit!!");
						System.out.println("Enter choice for Stack Operations : ");
						subchoice = sc.nextInt();
						
						
						
						switch(subchoice) {
						case 1: System.out.println("Pushing is done successfully..");
						break;
						case 2: System.out.println("Poping is done successfully..");
						break;
						case 3: System.out.println("Peeking is done successfully..");
						break;
						default: System.out.println("Enter valid Operation No.:");
						break;
						
						
						}
						
					} while (subchoice != 4);  
				  }
				  break; 
				  case 2:{
					  System.out.println("Your choice is Queue");
				     
					  int subchoice = 0;
						do {
							System.out.println("Below is the List of Queue Operations:");
							System.out.println("1. Enqueue");
							System.out.println("2. Dequeue");
							System.out.println("3. Peek");
							System.out.println("Enter 4 to exit!!");
							System.out.println("Enter choice for Queue Operations : ");
							subchoice = sc.nextInt();
							
							
							switch(subchoice) {
							case 1: System.out.println("Enqueue is done successfully..");
							break;
							case 2: System.out.println("Dequeue is done successfully..");
							break;
							case 3: System.out.println("Peeking is done successfully..");
							break;
							default: System.out.println("Enter valid Operation No.:");
							break;
							}
						} while (subchoice != 4);
				  }
				      break;
				  case 3:{
				      System.out.println("Your choice is Array");
				     
				      int subchoice = 0;
						do {
							System.out.println("Below is the List of Array Operations:");
							System.out.println("1. Add");
							System.out.println("2. Update");
							System.out.println("3. Delete");
							System.out.println("4. Get");
							System.out.println("Enter 4 to exit!!");
							System.out.println("Enter choice for Array Operations : ");
							subchoice = sc.nextInt();
							
							
							switch(subchoice) {
							case 1: System.out.println("Adding is done successfully..");
							break;
							case 2: System.out.println("Updating is done successfully..");
							break;
							case 3: System.out.println("Deleted  successfully..");
							break;
							case 4: System.out.println("Reading is done successfully..");
							break;
							default: System.out.println("Enter valid Operation No.:");
							break;
							}
						} while (subchoice != 5);
				  }
				      break; 
				  case 4:{
				      System.out.println("Your choice is LinkList");
				      
				      int subchoice = 0;
						do {
							System.out.println("Below is the List of LinkList Operations:");
							System.out.println("1. Get");
							System.out.println("2. Insert");
							System.out.println("3. Delete");
							System.out.println("Enter 4 to exit!!");
							System.out.println("Enter choice for LinkList Operations : ");
							subchoice = sc.nextInt();
							
							
							switch(subchoice) {
							case 1: System.out.println("Reading is done successfully..");
							break;
							case 2: System.out.println("Insertion is done successfully..");
							break;
							case 3: System.out.println("Deleted successfully..");
							break;
							default: System.out.println("Enter valid Operation No.:");
							break;
							}
						} while (subchoice != 4);
				  }    
				      break; 
				  default:
				  System.out.println("Invalid Choice!!"); 
				  }
				 
		} while (choice != getMenuItems().size());
		 
		 
		
		
		
		
		
			
			 
			 
	}

}
