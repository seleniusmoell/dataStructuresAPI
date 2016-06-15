package Queue;

public class Main {

	public static void main(String[] args) {
		LinkedListQueue<String> q = new LinkedListQueue<String>();
		
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

		
		ResizingArrayQueue<String> q2 = new ResizingArrayQueue<String>();
		
		q2.enqueue("shall");
		q2.enqueue("I");
		q2.enqueue("compare");
		q2.enqueue("thee");
		q2.enqueue("to");
		q2.enqueue("a");
		q2.enqueue("summer's");
		q2.enqueue("day");
		
		limit = q2.size();
		for(String s : q2){
			System.out.println(s);
		}

	}
}
