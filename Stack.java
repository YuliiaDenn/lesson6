package lesson3;

import java.util.LinkedList;
import java.util.Deque;

public class Stack {

	private Deque<Integer> list = new LinkedList<>();
	private Deque<String> slist = new LinkedList<>();

	public void push(int data) {

		list.add(data);
	}

	public int pop() {

		return list.pollLast();

	}

	public void push(String data) {

		slist.add(data);
	}

	public String popS() {

		return slist.pollLast();

	}
}
