package com.demo.lds.dataStructures;



public class ArrayDs<T> {
	
	int oldArr[] ;
	int oldSize;
	int index = 0;
	
	public ArrayDs(int size) {
		
		oldArr = new int[size];
		oldSize = size;
	}
	
	
	public void add(int data)
	{
		if(index < oldSize)
		{
			oldArr[index] = data;
			index++;
		}
		else
		{
			System.out.println("please resize the array");
		}
	}
	
	public void display()
	{
		for (int i = 0; i < oldArr.length; i++) {
			System.out.print("Element added successfully: "+oldArr[ i] + ", ");
			
		}
	}
	
	public void resize(int newsize)
	{
		if(newsize > oldSize)
		{
			int newArr[] = new int[newsize];
			for (int i = 0; i < oldArr.length; i++) {
				newArr[i] = oldArr[i];
			}
			oldArr = newArr;
			oldSize = newsize;
		}
		else
		{
			System.out.println("New size should greate than the old one: " + oldSize);
		}
		
	}
	
	/*
	 * public static void main(String ar[]) { ArrayDs array=new ArrayDs(5);
	 * array.add(4); array.add(6); array.display(); }
	 */
	
	/*Object[] data;
	int size;

	public ArrayDs() {
		size = 0;
		data = new Object[1];
	}

	public int getSize() {
		return data.length;
	}

	public T get(int index) {
		return (T) data[index];
	}

	public void insert(Object element) {
		// ensure capacity
		ensureCapacity(size + 1);
		data[size++] = element;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			// when someone delete any element
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;

			data = Arrays.copyOf(data, newCapacity);
		}

	}

	public void display() throws DataStructureException {
		if (size <= 0) {
			throw new DataStructureException("No Elements found");
		} else {
			for (int i = 0; i < data.length; i++) {
				System.out.println("elements in array= " + data[i]);
			}

		}

	}*/
}
