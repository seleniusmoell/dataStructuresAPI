package Stack;

import java.util.Iterator;

public class LinkedListStack<Item> extends Stack<Item>{
	Node first;
	int size = 0;


	@Override
	public void push(Item item) {
		Node old = first;		
		first = new Node();
		first.item = item;
		first.next = old;
		size++;
	}

	@Override
	public Item pop() {
		Item item = first.item;
		first = first.next;
		size--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public int size() {
		return size;
	}

	private class Node{
		Item item;
		Node next;
	}

	@Override
	public Iterator<Item> iterator() {

		return new ListIterator();
	}


	private class ListIterator implements Iterator<Item>{
		
		private Node current = first;
		
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		public boolean hasNext() {
			return current != null;
		}
	}

}
