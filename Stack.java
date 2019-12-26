package lesson3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stack {

	private List<Integer> list = new LinkedList<>();

	public void push(int data) {

		list.add(data);
	}

	public int pop() {

		Iterator<Integer> iterator = list.iterator();
		Integer item = null;

		while (iterator.hasNext()) {
			item = iterator.next();

		}
		iterator.remove();
		return item;

	}
}
