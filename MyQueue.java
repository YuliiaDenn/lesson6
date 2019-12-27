package lesson3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {

	private Queue<T> queue = new LinkedList<>();

	public void push(T data) {
		queue.add(data);
	}

	public T pop() {
		return queue.poll();
	}

}
