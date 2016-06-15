package QueueOfStrings;

public class ResizingArrayQueueOfStrings extends QueueOfStrings {
	private String[] q = new String[1];
	private int tail = 0;
	private int head = 0;
	
	@Override
	public void enqueue(String item) {
		
		if((tail-head)%q.length == 0)
			resize(2*q.length);
		
		q[tail] = item;
		tail++;
	}

	@Override
	public String dequeue() {
		String item = q[head];
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
		String[] copy = new String[capacity];
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

}
