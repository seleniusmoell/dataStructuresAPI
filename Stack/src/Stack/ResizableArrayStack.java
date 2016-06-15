package Stack;

import java.util.Iterator;

public class ResizableArrayStack<Item> extends Stack<Item> {
	
	private Item[] s = (Item[])new Object[1];
	private int nextIndex = 0;

	@Override
	public void push(Item item) {
		if (nextIndex == s.length)
			resize(2*s.length);
		s[nextIndex++] = item;
	}

	@Override
	public Item pop() {
		Item item = s[--nextIndex];
		s[nextIndex] = null;
		
		if(nextIndex > 0 && nextIndex == s.length/4)
			resize(s.length/2);
		return item;
	}

	@Override
	public boolean isEmpty() {
		return nextIndex == 0;
	}

	@Override
	public int size() {
		return nextIndex;
	}
	
	public void resize(int capacity){
		Item[] copy = (Item[])new Object[capacity];
		
		for(int i = 0; i < nextIndex; i++){
			copy[i] = s[i];
		}
		
		s = copy;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i = nextIndex;

		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {			
			return s[--i];
		}
	}

}
