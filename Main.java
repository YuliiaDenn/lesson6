package lesson3;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(5);
		stack.push(13);
		stack.push(14);
		stack.push(15);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();

		Stack<String> stackS = new Stack<>();

		stackS.push("red");
		stackS.push("blue");
		stackS.push("green");
		stackS.push("white");

		System.out.println(stackS.pop());
		System.out.println(stackS.pop());
		System.out.println(stackS.pop());
		System.out.println(stackS.pop());
		System.out.println();

		MyQueue<Integer> queue = new MyQueue<Integer>();

		queue.add(23);
		queue.add(24);
		queue.add(25);
		queue.add(26);

		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println();

		MyQueue<String> queueS = new MyQueue<String>();

		queueS.add("black");
		queueS.add("yellow");
		queueS.add("pink");
		queueS.add("grey");

		System.out.println(queueS.get());
		System.out.println(queueS.get());
		System.out.println(queueS.get());
		System.out.println(queueS.get());
		System.out.println();

	}

}
