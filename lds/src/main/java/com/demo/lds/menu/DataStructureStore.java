package com.demo.lds.menu;

import com.demo.lds.dataStructures.ArrayDs;
import com.demo.lds.dataStructures.CustomLinkedList;
import com.demo.lds.dataStructures.CustomQueue;
import com.demo.lds.dataStructures.CustomStack;

public class DataStructureStore {

	private static DataStructureStore INSTANCE;

	public final CustomStack stack = new CustomStack();
	public final CustomQueue queue = new CustomQueue(5);
	public final ArrayDs array = new ArrayDs(5);
	public final CustomLinkedList linkedlist = new CustomLinkedList();

	private DataStructureStore() {

	}

	public static DataStructureStore getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DataStructureStore();
		}
		return INSTANCE;
	}

	public CustomStack getStack() {
		return stack;
	}

	public CustomQueue getQueue() {
		return queue;
	}

	public ArrayDs getArray() {
		return array;
	}

	public CustomLinkedList getLinkedList() {
		return linkedlist;
	}

}
