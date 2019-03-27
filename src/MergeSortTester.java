import java.util.ArrayList;
import Classes.ArrayQueue;
import Classes.Queue;

public class MergeSortTester {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			list.add(10);
	
		
		
		Queue<Integer> q = toArrayQueue(list);
		sort(q);
		toArrayList(q, list);
		
		System.out.println("\n The List sorted in increasing order:");
		System.out.println(list);
	}
	
	public static ArrayQueue<Integer> toArrayQueue(ArrayList<Integer> list) {
		ArrayQueue<Integer> aqueue = new ArrayQueue<Integer>();
		for (int i = 0; i < list.size(); i++) {
			aqueue.enqueue(list.get(i));
		}
		
		return aqueue;
	}
	
	public static void toArrayList(Queue<Integer> queue, ArrayList<Integer> list) {
		while(!list.isEmpty()) {
			list.remove(list.size()-1);
		}
		int size = queue.size();
		for (int i = 0; i < size; i++) {
			list.add(queue.dequeue());
		}
	}
	
	// Sorts the elements in the given queue in non-decreasing order
	public static void sort(Queue<Integer> queue) {
		if (queue.size() > 1) {     
			Queue<Integer> q1, q2; 
			//Similar to previous lab
			q1 = new ArrayQueue<>(); 
			q2 = new ArrayQueue<>(); 

			int size = queue.size();
			for (int i = 0; i < size / 2; i++) 
				q1.enqueue(queue.dequeue());

			while (!queue.isEmpty())
				q2.enqueue(queue.dequeue()); 

			sort(q1);    // Test to see if it works
			sort(q2);    // Test to see if it works
			//Merge-area (look for examples in old Java labs)
			while (!q1.isEmpty() && !q2.isEmpty())
				if (((Comparable<Integer>) q1.first()).compareTo(q2.first()) <= 0)
					queue.enqueue(q1.dequeue()); 
				else queue.enqueue(q2.dequeue()); 
			
			Queue<Integer> r = (!q1.isEmpty() ? q1 : q2);  
			while (!r.isEmpty())
				queue.enqueue(r.dequeue()); 
		} 

	}

}
