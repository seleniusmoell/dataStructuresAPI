****************************
* API for Queue classes
****************************

Queue consists of two implementetaions of the Queue Datastructure,
linked-list implementation and re-sizable array implementation. Both 
implement the following API:

	public Queue(){}
	
	public abstract void enqueue(Item item);
	
	public abstract Item dequeue();
	
	public abstract boolean isEmpty();
		
	public abstract Iterator<Item> iterator();
