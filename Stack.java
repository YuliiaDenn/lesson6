package lesson3;

import java.util.LinkedList;
import java.util.Deque;

public class Stack {

	private Deque<Integer> list = new LinkedList<>();
	

	public void push(int data) {

		list.add(data);
	}

	public int pop() {
		
		return list.pop();
		
	}
}
