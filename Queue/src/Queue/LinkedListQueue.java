package QueueOfStrings;

import java.util.Iterator;

public class LinkedListQueue<Item> extends Queue<Item> {
	private Node first, last;
	private int size = 0;

	@Override
	public void enqueue(Item item) {
		Node old = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if(isEmpty())
			first = last;
		else
			old.next = last;
		size++;
	}

	@Override
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		
		if(isEmpty())
			last = null;
		
		size--;
		return item;
	}

	@Override
	public boolean isEmpty() {		
		return first == null;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class Node {
		Item item;
		Node next;
	}

	private class ListIterator implements Iterator<Item>{
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
}
