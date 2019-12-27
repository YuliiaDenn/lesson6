package lesson3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	private Queue<Integer> queue = new LinkedList<>();
	private Queue<String> queueS = new LinkedList<>();

	public void push(int data) {
		queue.add(data);
	}

	public int pop() {
		return queue.poll();
	}

	public void push(String data) {
		queueS.add(data);
	}

	public String popS() {
		return queueS.poll();
	}

}
