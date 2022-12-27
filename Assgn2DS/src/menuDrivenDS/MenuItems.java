package menuDrivenDS;

public class MenuItems {
	private String name;
	private int order;
	private MenuItems parent;
	public MenuItems(int order, String name) {
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
	public MenuItems getParent() {
		return parent;
	}
	public void setParent(MenuItems parent) {
		this.parent = parent;
	}
	
	

}
