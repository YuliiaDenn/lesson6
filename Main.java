package lesson3;

public class Main {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(5);
		stack.push(13);
		stack.push(14);
		stack.push(15);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		
		MyQueue queue = new MyQueue();
		
		queue.push(23);
		queue.push(24);
		queue.push(25);
		queue.push(26);
		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
		

	}

}
