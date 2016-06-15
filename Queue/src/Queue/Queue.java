package Queue;

import java.util.Iterator;

public abstract class Queue<Item> implements Iterable<Item>{
	
	public Queue(){}
	
	public abstract void enqueue(Item item);
	
	public abstract Item dequeue();
	
	public abstract boolean isEmpty();
	
	public abstract Iterator<Item> iterator();

}
