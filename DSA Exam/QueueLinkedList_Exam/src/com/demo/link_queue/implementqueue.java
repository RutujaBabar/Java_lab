package com.demo.link_queue;

import java.util.Stack;

import com.demo.beans.Employee;

public class implementqueue {
	
	private Node head=null;
	
	//create Node class
	class Node{
		Employee data;
		Node next;
		
		//create Node class constructor
		public Node(Employee val) {
			data=val;
			next=null;
		}
	}
	

	//create adddata function
	public void adddata(Employee val, int pos) {
		if(head==null) {
			Node newnode = new Node(val);
			System.out.println("list is empty");
			newnode.next=head;
			head=newnode;
		}else {
			Node newnode = new Node(val);
			if(pos==1) {
				newnode.next=head;
				head=newnode;
			}else {
				Node temp = head;
				
				for(int i=0;temp!=null && i<pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newnode.next=temp.next;
					temp.next=newnode;
				}
			}
		}
		
	}


	//create removedata function
	public void removedata(int id) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			Node prev=null;
			
			if(head.data.getEmpid()==id) {
				head=head.next;
				temp.next=null;
				temp=null;
			}else {
				while(temp!=null && temp.data.getEmpid()!=id) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}
			}
		}
		
	}


	//display all data function
	public void display() {
		if(head==null) {
			System.out.println("List is Empty...");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		
	}


	//display only female employee data function
	public void femaledata() {
		if(head==null) {
			System.out.println("List is Empty...");
		}
		Node temp = head;
		while(temp!=null) {
			if(temp.data.getGender().equals("female")) {
				System.out.println(temp.data);
			}
			temp=temp.next;
		}
		//System.out.println("Hiiii");
		
	}


	//display only male employee data function
	public void maledata() {
		if(head==null) {
			System.out.println("List is Empty...");
		}
		Node temp = head;
		while(temp!=null) {
			if(temp.data.getGender().equals("male")) {
				System.out.println(temp.data);
			}
			temp=temp.next;
		}
		
		
	}
	
	public void emptyqueuerecursion() {
	    // Implement a recursive function to remove all employees from the queue
	    // Base case: If the queue is empty, stop
	    // Otherwise, remove an employee and make a recursive call
	    emptyQueueRecursionHelper(head);
	    head = null; // Reset the head after emptying the queue
	}

	private void emptyQueueRecursionHelper(Node current) {
	    if (current == null) {
	        return; // Base case: Queue is empty
	    }
	    // Remove the employee (or perform any other necessary action)
	    // Make a recursive call with the next node
	    emptyQueueRecursionHelper(current.next);
	    // Clean up (optional): Set current.next to null
	    System.out.println(current.data);
	    current.next = null;
	}

	public void queuereverse() {
	    // Use a stack or another data structure to reverse the order of employees in the queue
	    // Then print the reversed queue
	    Stack<Employee> stack = new Stack<>();
	    Node temp = head;
	    while (temp != null) {
	        stack.push(temp.data);
	        temp = temp.next;
	    }
	    while (!stack.isEmpty()) {
	        System.out.println(stack.pop());
	    }
	}
	
	
	
	
	
		
	}


