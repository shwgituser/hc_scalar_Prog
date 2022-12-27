package menuDrivenDS;

public class MenuItem {
	private String name;
	private int order;
	private MenuItem parent;

	public MenuItem(int order, String name) {
		super();
		this.name = name;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public MenuItem getParent() {
		return parent;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	public void display() {
		System.out.println(order + "." + name);
	}

}
