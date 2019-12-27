package lesson3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {

	private Queue<T> queue = new LinkedList<>();

	public void add(T data) {
		queue.add(data);
	}

	public T get() {
		return queue.poll();
	}

}
