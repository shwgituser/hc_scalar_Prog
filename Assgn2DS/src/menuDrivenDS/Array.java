package menuDrivenDS;



public class Array {
	
	int numarray[] ;
	int numarraysize;
	int index = 0;
	
	public Array(int size) {
		// TODO Auto-generated constructor stub
		numarray = new int[size];
		numarraysize = size;
	}
	
	public Array() {
		
	}

	public void add(int data)
	{
		if(index < numarraysize)
		{
			numarray[index] = data;
			index++;
		}
		else
		{
			System.out.println("please resize the array");
		}
	}
	
	public void display()
	{
		for (int i = 0; i < numarray.length; i++) {
			System.out.print("Element added successfully: "+numarray[ i] + ", ");
			
		}
	}
	
	public void resize(int newsize)
	{
		if(newsize > numarraysize)
		{
			int numarraynew[] = new int[newsize];
			for (int i = 0; i < numarray.length; i++) {
				numarraynew[i] = numarray[i];
			}
			numarray = numarraynew;
			numarraysize = newsize;
		}
		else
		{
			System.out.println("New size should greate than the old one: " + numarraysize);
		}
		
	}
	
	public static void main(String ar[]) {
		Array array=new Array(5);
		array.add(4);
		array.add(6);
		array.display();
	}
}
