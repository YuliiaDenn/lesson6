package lesson3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	private Queue<Integer> queue = new LinkedList<>();

	public void push(int data) {
		queue.add(data);
	}

	public int pop() {
		return queue.poll();
	}

}
