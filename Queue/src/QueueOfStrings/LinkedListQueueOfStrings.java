package QueueOfStrings;

public class LinkedListQueueOfStrings extends QueueOfStrings {
	private Node first, last;
	private int size = 0;

	@Override
	public void enqueue(String item) {
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
	public String dequeue() {
		String item = first.item;
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
	
	private class Node {
		String item;
		Node next;
	}
}
