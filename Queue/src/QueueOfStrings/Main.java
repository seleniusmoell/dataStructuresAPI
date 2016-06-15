package QueueOfStrings;

public class Main {

	public static void main(String[] args) {
		LinkedListQueueOfStrings q = new LinkedListQueueOfStrings();
		
		q.enqueue("to");
		q.enqueue("be");
		q.enqueue("or");
		q.enqueue("not");
		q.enqueue("to");
		q.enqueue("be");
		
		int limit = q.size();
		for (int i=0; i<limit; i++){
			System.out.println(q.dequeue());
		}

		
		ResizingArrayQueueOfStrings q2 = new ResizingArrayQueueOfStrings();
		
		q2.enqueue("shall");
		q2.enqueue("I");
		q2.enqueue("compare");
		q2.enqueue("thee");
		q2.enqueue("to");
		q2.enqueue("a");
		q2.enqueue("summer's");
		q2.enqueue("day");
		
		limit = q2.size();
		for(int i = 0; i<limit; i++){
			System.out.println(q2.dequeue());
		}

	}
}
