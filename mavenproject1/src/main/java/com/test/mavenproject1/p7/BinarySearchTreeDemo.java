package com.test.mavenproject1.p7;

import com.test.mavenproject1.p1.Read;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree root =null,temp = null;
		int ch=0;
		do {
			System.out.println("Enter 0 to exit , 1 to add & 2 to display");
			ch = Read.sc.nextInt();
			switch (ch) {
			case 0:
				
				break;
			case 1:
				BinarySearchTree x = new BinarySearchTree();
				System.out.println("Enter integer value");
				x.node = Read.sc.nextInt();
				x.left= null;
				x.right=null;
				if(root==null) {
					root = x;
				}
				else {
		while(true) {
			if(temp.node>x.node) {
				if(temp.left==null) {
					temp.left = x;
					break;
				}
				else {
					temp=temp.left;
				}
			}
			else {
				if(temp.right==null) {
					temp.right = x;
					break;
				}
				else {
					temp=temp.right;
				}
			}
		}
	}
	break;
case 2:
	display(root);
	break;
default:
	System.out.println("Invalid Entry, Please try again");
	break;
}
} while (ch!=0);

}

public static void display(BinarySearchTree root) {
if(root==null)return;
display(root.left);
System.out.println(root.node);
display(root.right);
}

				

	}

 
