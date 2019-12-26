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

	}

}
