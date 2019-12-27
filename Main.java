package lesson3;

public class Main {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(5);
		stack.push(13);
		stack.push(14);
		stack.push(15);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();

		Stack stackS = new Stack();

		stackS.push("red");
		stackS.push("blue");
		stackS.push("green");
		stackS.push("white");

		System.out.println(stackS.popS());
		System.out.println(stackS.popS());
		System.out.println(stackS.popS());
		System.out.println(stackS.popS());
		System.out.println();

		MyQueue queue = new MyQueue();

		queue.push(23);
		queue.push(24);
		queue.push(25);
		queue.push(26);

		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println();

		MyQueue queueS = new MyQueue();

		queueS.push("black");
		queueS.push("yellow");
		queueS.push("pink");
		queueS.push("grey");

		System.out.println(queueS.popS());
		System.out.println(queueS.popS());
		System.out.println(queueS.popS());
		System.out.println(queueS.popS());
		System.out.println();

	}

}
