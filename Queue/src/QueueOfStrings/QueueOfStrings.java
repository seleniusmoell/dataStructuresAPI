package QueueOfStrings;

public abstract class QueueOfStrings {
	
	public QueueOfStrings(){}
	
	public abstract void enqueue(String item);
	
	public abstract String dequeue();
	
	public abstract boolean isEmpty();

}
