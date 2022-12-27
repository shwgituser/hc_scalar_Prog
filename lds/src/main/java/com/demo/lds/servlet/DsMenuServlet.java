package com.demo.lds.servlet;

import java.io.IOException;
import java.util.Map;

import com.demo.lds.dataStructures.ArrayDs;
import com.demo.lds.dataStructures.CustomLinkedList;
import com.demo.lds.dataStructures.CustomQueue;
import com.demo.lds.dataStructures.CustomStack;
import com.demo.lds.dataStructures.Menu;
import com.demo.lds.menu.DataStructureMenuStore;
import com.demo.lds.menu.DataStructureStore;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class DsMenuServlet extends HttpServlet {

	private ObjectMapper mapper = new ObjectMapper();

	//added doPost() method
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String , String[]> parameterMap = req.getParameterMap();
		//get all the parameters as key,value pairs in parameterMap
		String[] name = parameterMap.get("name");
		switch(name[0])
		{
			case "queue":
			{
				String[] option = parameterMap.get("submenu");
				
				switch(option[0])
				{
					case "peak()":
					{
						CustomQueue queue = DataStructureStore.getInstance().getQueue();
						resp.getWriter().append(mapper.writeValueAsString(queue.peak())).flush();
					}
					break;
					
					case "enqueue()":
					{
						CustomQueue queue = DataStructureStore.getInstance().getQueue();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]); 
						System.out.println("recevied " + input_int + " from user");
						queue.enqueue(input_int);
						resp.getWriter().append(mapper.writeValueAsString("Element added : "+input_int)).flush();
					}
					break;
					case "dequeue()":
					{
						CustomQueue queue = DataStructureStore.getInstance().getQueue();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]);
						//System.out.println("recevied " + input_int + " from user");
						resp.getWriter().append(mapper.writeValueAsString(queue.dequeue())).flush();
						//queue.dequeue(input_int);
						//resp.getWriter().append(mapper.writeValueAsString("Element added : "+input_int)).flush();
					}
					break;
					case "isEmpty()":
					{
						CustomQueue queue = DataStructureStore.getInstance().getQueue();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]);
						//System.out.println("recevied " + input_int + " from user");
						resp.getWriter().append(mapper.writeValueAsString(queue.isEmpty())).flush();
						//queue.enqueue(input_int);
						//resp.getWriter().append(mapper.writeValueAsString("Element added : "+input_int)).flush();
					}
					break;
					}
				break;
			}
			case "stack":{
				String[] option = parameterMap.get("submenu");
				switch(option[0])
				{
					case "peak()":
					{
						CustomStack stack = DataStructureStore.getInstance().getStack();
						resp.getWriter().append(mapper.writeValueAsString(stack.peek())).flush();
					}
					break;
					
					case "push()":
					{
						CustomStack stack = DataStructureStore.getInstance().getStack();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]); 
						System.out.println("recevied " + input_int + " from user");
						stack.push(input_int);
						resp.getWriter().append(mapper.writeValueAsString("Element added : "+input_int)).flush();
					}
					break;
					case "pop()":
					{
						CustomStack stack = DataStructureStore.getInstance().getStack();
						resp.getWriter().append(mapper.writeValueAsString(stack.pop())).flush();
						
					}
					break;
					case "isEmpty()":
					{
						CustomStack stack = DataStructureStore.getInstance().getStack();
						resp.getWriter().append(mapper.writeValueAsString(stack.isEmpty())).flush();
						
					}
						
					break;
					
				}
				break;
				
			}
			case "array":{
				String[] option = parameterMap.get("submenu");
				switch(option[0])
				{
					
					
					case "add()":
					{
						ArrayDs array = DataStructureStore.getInstance().getArray();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]); 
						System.out.println("recevied " + input_int + " from user");
						array.add(input_int);
						resp.getWriter().append(mapper.writeValueAsString("Element added : "+input_int)).flush();
					}
					break;
					case "display()":
						{
							ArrayDs array = DataStructureStore.getInstance().getArray();
							array.display();
							resp.getWriter().append(mapper.writeValueAsString("Array Display")).flush();
						}
					break;
					case "resize()":
					{
						ArrayDs array = DataStructureStore.getInstance().getArray();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]); 
						System.out.println("recevied " + input_int + " from user");
						array.resize(input_int);
						resp.getWriter().append(mapper.writeValueAsString("Array resized successfully: "+ input_int)).flush();
					}
						
					break;
				
			}
			break;
		}
			case "linklist":
			{
				String[] option = parameterMap.get("submenu");
				switch(option[0])
				{
					
					
					case "add()":
					{
						CustomLinkedList linkedlist = DataStructureStore.getInstance().getLinkedList();
						String[] input = parameterMap.get("input");
						int input_int = Integer.valueOf(input[0]); 
						System.out.println("recevied " + input_int + " from user");
						linkedlist.add(input_int);
						resp.getWriter().append(mapper.writeValueAsString("Element added : "+input_int)).flush();
					}
					break;
					case "display()":
						{
							CustomLinkedList linkedlist = DataStructureStore.getInstance().getLinkedList();
							linkedlist.display();
							resp.getWriter().append(mapper.writeValueAsString("LinkedList Display")).flush();
						}
					break;
				
			}
			break;
		}
		}
	}
			
		
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();// /display?name="stack"
		String operationName = path.substring("/".length());

		switch (operationName) {
		case "display":
			Menu menuToDisplay = menuToDisplay(req.getParameter("name"));
			resp.getWriter().append(mapper.writeValueAsString(menuToDisplay)).flush();
			break;

		default:
			break;
		}

	}

	public Menu menuToDisplay(String menuName) {
		if (menuName == null) {
			menuName = "";
		}
		Menu menuToDisplay;
		switch (menuName) {
		case "stack":
			menuToDisplay = DataStructureMenuStore.getInstance().getStackMenu();
			break;
		case "queue":
			menuToDisplay = DataStructureMenuStore.getInstance().getQueueMenu();
			break;
		case "linkedlist":
			menuToDisplay = DataStructureMenuStore.getInstance().getLinkedListMenu();
			break;
		case "array":
			menuToDisplay = DataStructureMenuStore.getInstance().getArrayMenu();
			break;
		case "main":
		default:
			menuToDisplay = DataStructureMenuStore.getInstance().getMainMenu();
			break;
		}
		return menuToDisplay;
	}

}
