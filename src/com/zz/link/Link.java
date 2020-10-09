package com.zz.link;

public class Link {
	
	public void print(Node root){
		if(root!=null){
			System.out.print(root.data+"\t");
			if(root.next!=null){
				print(root.next);
			}
		}
	}
	
	public void insert(Node root, Node node){
		if(root!=null){
			if(root.next!=null){
				insert(root.next, node);
			}else{
				root.next=node;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Node n=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
//		n.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
		Link link=new Link();
		link.insert(n, n2);
		link.insert(n, n3);
		link.insert(n, n4);
		link.insert(n, n5);
		link.print(n);
		
	}

}
