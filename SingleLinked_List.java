package Employee;

import java.util.Scanner;

public class SingleLinked_List {
	private Node head;
	private Scanner sc;

	public SingleLinked_List() {
		head = null;
		sc = new Scanner(System.in);
	}

	public Node createNewNode() {
		Node newnode = new Node();
		System.out.println("Enter Data value:");
		newnode.setData(sc.nextInt());
		newnode.setNext(null);
		return newnode;
	}

	public void addStart() {
		Node newnode = createNewNode();
		if (head == null) {
			head = newnode;
		} else {
			newnode.setNext(head);
			head = newnode;
		}
	}

	public void deleteFromStart() {
		if (head == null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else {
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			System.out.println("Node is deleted");
		}
	}

	public void addLast() {
		Node newnode = createNewNode();
		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newnode);
		}
	}

	public void deleteFromEnd() {
		if (head == null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else if (head.getNext() == null) {
			head = null;
			System.out.println("Node is deleted");
		} else {
			Node temp = head;
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(null);
			System.out.println("Node is deleted");
		}
	}

	public void addMid(int value) {
		Node newnode = createNewNode();
		if (head == null) {
			head = newnode;
		} else if (head.getNext() == null) {
			if (head.getData() == value) {
				head.setNext(newnode);
			} else {
				System.out.println("\tError::Node not exists....!!!!");
			}
		} else {
			Node temp = head;
			while (temp != null && temp.getData() != value) {
				temp = temp.getNext();
			}
			if (temp != null) {
				newnode.setNext(temp.getNext());
				temp.setNext(newnode);
			} else {
				System.out.println("\tError::Node not found....!!!!");
			}
		}
	}

	public void deleteFromMid(int value) {
		if (head == null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else if (head.getNext() == null) {
			if (head.getData() == value) {
				head = null;
				System.out.println("Node is deleted");
			} else {
				System.out.println("\tError::Node not exists....!!!!");
			}
		} else {
			Node temp = head;
			Node prev = null;
			while (temp != null && temp.getData() != value) {
				prev = temp;
				temp = temp.getNext();
			}
			if (temp != null) {
				prev.setNext(temp.getNext());
				temp.setNext(null);
				System.out.println("Node is deleted");
			} else {
				System.out.println("\tError::Node not found....!!!!");
			}
		}
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else {
			while (temp != null) {
				System.out.print(temp.getData() + "->");
				temp = temp.getNext();
			}
			System.out.println("null");
		}
	}

}