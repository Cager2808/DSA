package com.dsa.linkedlist;
import java.util.*;

class Node{
int data;
Node next;

Node(){
	this.data=0;
	this.next=null;
}

Node(int d){
	this.data=d;
	this.next=null;
}
	
}

 class ConstructLL {
	
	static Node solution(int arr[]) {
		if(arr.length==0) return null; // if array is empty
		
		Node head=new Node(arr[0]); //Initialized Head with arrays first Element
		Node temp=head;
		for(int i=1;i<arr.length;i++) {
			temp.next=new Node(arr[i]);
			temp=temp.next; //moving the temp
			
		}
		
		return head;
	}

}
 
 //Question Link//
// https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
