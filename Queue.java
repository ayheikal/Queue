package data_structuresImplementation;

import data_structuresImplementation.Stack.Node;

public class Queue {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	/********************************************************/
	public static void push(Queue queue,int data) {
		Node newnode=new Node(data);
		newnode.next=null;
		if(queue.head==null) {
			queue.head=newnode;
			
		}
		else {
			Node cur=queue.head;
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next=newnode;
		}
	}
	/**********************************************************/
	public static boolean isEmpty(Queue queue) {
		return (queue.head==null)?true:false;
	}
	/*************************************************************/
	public static int size(Queue queue) {
		if(isEmpty(queue)) {
			return 0;
		}
		Node use=queue.head;
		int counter=0;
		while(use!=null) {
			use=use.next;
			counter++;
		}
		return counter;
	}
	/***************************************************************/
	public static void print(Queue queue) {
		Node use=queue.head;
		while(use!=null) {
			System.out.println(use.data+"  ");
			use=use.next;
		}
	}
	/***********************************************************/
	public static boolean pop(Queue queue) {
		if(isEmpty(queue)) {return false;}
		Node use=queue.head;
		queue.head=use.next;
		return true;
	}
	/************************************************************/
	public static void peek(Queue queue) {
	
		if(isEmpty(queue)) {System.out.println("queue is empty");
		}
		else {
		System.out.println( queue.head.data);
		}
		
	}
	/*****************************************************************/
	public static void top(Queue queue) {
		if(isEmpty(queue)) {System.out.println("queue is empty");}
		else {
		int elem=queue.head.data;
		queue.head=queue.head.next;
		System.out.println(elem);
		}
		
		
	}
	/********************************************************************/
	public static int search(Queue queue,int key) {
		Node use=queue.head;
		while(use!=null) {
			if(use.data==key) {
				return 1;
				
			}
			use=use.next;
			
		}
		return -1;
	}
	/******************************************************************/
	public static void main(String...strings) {
		Queue queue=new Queue();
		 top(queue);
		queue.push(queue, 5);
		queue.push(queue, 4);
		queue.push(queue, 3);
		System.out.println("searched: "+search(queue,3));
		queue.push(queue, 2);
		queue.push(queue, 1);
		System.out.println("size= "+size(queue));
		System.out.println("poped: "+pop(queue));
		
		queue.print(queue);
	}

}
