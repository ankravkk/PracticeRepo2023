package PracticeBinaryTree;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

class BinaryTree {
	public BinaryTree(Node rootNode) {
		this.rootNode = rootNode;
	}
	Node rootNode;
}
class Node{
	Node lefNode;
	Node rightNode;
	int value;
	public Node(int value) {
		this.lefNode=null;
		this.rightNode=null;
		this.value=value;
	}
}

class MethodsCreation{
	public static void inOrderTraversal(Node node) {
		if(node==null) {
			return;
		}
		inOrderTraversal(node.lefNode);
		System.out.println(node.value);
		inOrderTraversal(node.rightNode);
	}
	public static void postOrderTraversal(Node node) {
		if(node==null) {
			return;
		}
		postOrderTraversal(node.lefNode);
		postOrderTraversal(node.rightNode);
		System.out.println(node.value);
	}
	public static void preOrderTraversal(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.value);
		preOrderTraversal(node.lefNode);
		preOrderTraversal(node.rightNode);

	}
	public static boolean checkSymmetricTree(Node node1 , Node node2) {
		if(node1 == null && node2 ==null) {
			return true;
		}
		if(node1!=null && node2!=null && node1.value==node2.value) {
			return checkSymmetricTree(node1.lefNode, node2.rightNode)&&
				   checkSymmetricTree(node1.lefNode,node2.rightNode);
		}
		else {
			return false;
		}
	}
    public static Integer calculateHieghtOfBinartTree(Node node) {
    	int sum = 1   ; 
    	if(node==null) {
    		return 0;
    	}
    	return sum + Math.max(calculateHieghtOfBinartTree(node.lefNode),calculateHieghtOfBinartTree(node.rightNode));
	}
    public static boolean  checkIfTreeIsIdentical(Node node1,Node node2 ) {
    	if(node1==null && node2 == null) {
    		return true;
    	}
    	if(node1!=null && node2!=null) {
    		if(node1.value==node2.value)
        	return checkIfTreeIsIdentical(node1.rightNode, node2.rightNode)&&checkIfTreeIsIdentical(node1.lefNode, node2.lefNode);
    	}
    	return false;
   	}
    
    public static List<Integer> branchSum(Node node) {
    	int sum = 0 ; 
    	ArrayList<Integer> arrayList = new ArrayList<>();
        if(node == null ) {
        	return arrayList;
        }
        if(node!=null) {
        	sum=sum+node.value;
        }

        return branchSum(node.lefNode);
    	
	}
}

class MainRun{
	public static void main(String[] args) {
        Node root = new Node(1);
        root.lefNode = new Node(2);
        root.rightNode = new Node(3);
        root.rightNode.lefNode = new Node(4);
        root.lefNode.rightNode = new Node(5);
		Node node = new Node(3);
		node.rightNode = new Node(2);
		node.rightNode.rightNode = new Node(1);
		node.rightNode.rightNode.rightNode = new Node(1);
		node.rightNode.rightNode.rightNode.rightNode = new Node(1);
		node.rightNode.rightNode.rightNode.rightNode.rightNode = new Node(1);
		node.lefNode = new Node(2);
		node.lefNode.lefNode = new Node(1);
		node.lefNode.lefNode.lefNode = new Node(1);
		node.lefNode.lefNode.lefNode.lefNode = new Node(1);
		BinaryTree bTree = new BinaryTree(node);
		//MethodsCreation.preOrderTraversal(bTree.rootNode);
		//MethodsCreation.postOrderTraversal(bTree.rootNode);
		//MethodsCreation.inOrderTraversal(bTree.rootNode);
		//Boolean isBoolean = MethodsCreation.checkSymmetricTree(node.lefNode, node.rightNode);
	    Boolean isIdenticalTree = MethodsCreation.checkIfTreeIsIdentical(node,node);
        System.out.println(isIdenticalTree);
	}

}