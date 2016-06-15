package Queue;

import java.util.Iterator;

public class ResizingArrayQueue<Item> extends Queue<Item> implements Iterable<Item>{
	private Item[] q = (Item[])new Object[1];
	private int tail = 0;
	private int head = 0;

	@Override
	public void enqueue(Item item) {

		if((tail-head)%q.length == 0)
			resize(2*q.length);

		q[tail] = item;
		tail++;
	}

	@Override
	public Item dequeue() {
		Item item = q[head];
		q[head] = null;

		if(size() < q.length/2 )
			resize(q.length/2);

		head++;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return q[head] == null;
	}

	private void resize(int capacity){
		Item[] copy = (Item[])new Object[capacity];
		int qIndex = head;

		for(int i=0; i<size(); i++){
			copy[i] = q[qIndex];
			qIndex++;
		}

		int size = size();
		head = 0;
		tail = head+size;;
		q = copy;
	}

	public int size(){
		return tail-head;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item>{
		private int i = head;
		@Override
		public boolean hasNext() {
			return i < tail;
		}

		@Override
		public Item next() {
			
			return q[i++];
		}
	}


}
