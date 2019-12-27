package lesson3;

import java.util.LinkedList;
import java.util.Deque;

public class Stack<T> {

	private Deque<T> list = new LinkedList<>();

	public void push(T data) {

		list.add(data);
	}

	public T pop() {

		return list.pollLast();

	}

}
