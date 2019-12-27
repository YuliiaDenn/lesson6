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

		queue.push(23);
		queue.push(24);
		queue.push(25);
		queue.push(26);

		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println();

		MyQueue<String> queueS = new MyQueue<String>();

		queueS.push("black");
		queueS.push("yellow");
		queueS.push("pink");
		queueS.push("grey");

		System.out.println(queueS.pop());
		System.out.println(queueS.pop());
		System.out.println(queueS.pop());
		System.out.println(queueS.pop());
		System.out.println();

	}

}
