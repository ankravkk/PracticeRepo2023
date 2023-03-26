package LinkedListQuest;

import javax.xml.transform.Templates;

public class LinkedList {

	LinkedList next;
	int value;

	public LinkedList () {

	}
	public LinkedList(Integer value ) {
		this.value=value;
		this.next=null;
	}
	// Getting Reversed of Linked List 
	static LinkedList geLinkedListReveLinkedList(LinkedList linkedList) {
			LinkedList currentList = linkedList;
			LinkedList previousList = null;
             while (currentList!=null) {
            	 LinkedList tempLinkedList = currentList.next;
            	 currentList.next=previousList;
            	 previousList = currentList;
            	 currentList= tempLinkedList;
			}
            
		return previousList;
	}
	


	// Getting Reversal Traversal of Linked List
	static void traverseLinkedList(LinkedList linkedList) {
		if(linkedList==null) {
			return;
		}
		//For Normal Sequential traverse 
		//System.out.print(linkedList.value);
		//traverseLinkedList(linkedList.next);

		traverseLinkedList(linkedList.next);
		System.out.print(linkedList.value);

	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList(11);
		l1.next = new LinkedList(12);
		l1.next.next = new LinkedList(13);
		l1.next.next.next = new LinkedList(14);
		l1.next.next.next.next = new LinkedList(15);
	traverseLinkedList(geLinkedListReveLinkedList(l1));
		//.toString());


	}

}
