import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class collectionframework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack<String> animals=new Stack<>();
		animals.push("lion");
		animals.push("tiger");
		animals.push("cat");
		animals.push("rat");
		System.out.println(animals.peek());
		System.out.println(animals.pop());
		System.out.println(animals.peek());*/
		
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(12);
		queue.offer(22);
		queue.offer(23);
		queue.offer(15);
		System.out.print(queue);
		queue.poll();
		System.out.print(queue);
	}

}
