package lesson3;

import java.util.LinkedList;

public class StackQueue {

	public static void main(String[] args) {

		LinkedList<Integer> stack = new LinkedList<>();

		stack.push(24);
		stack.push(12);
		stack.push(75);
		stack.push(36);

		while (stack.peek() != null) {

			System.out.println(stack.pop());

		}

		System.out.println();
		
		LinkedList<String> queue = new LinkedList<>();

		queue.add("red");
		queue.add("blue");
		queue.add("black");
		queue.add("yellow");

		while (queue.peek() != null) {
			System.out.println(queue.pollFirst());
		}

	}
}
