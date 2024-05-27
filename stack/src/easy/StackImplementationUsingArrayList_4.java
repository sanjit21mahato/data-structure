package easy;

import java.util.ArrayList;

public class StackImplementationUsingArrayList_4 {


	static ArrayList<Integer> l = new ArrayList<>();

	public static void main(String[] args) {
		push(10);
		push(20);
		System.out.println(peek());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(peek());
		System.out.println(isEmpty());
		System.out.println(size());
	}

	private static int size() {
		return l.size();
	}

	private static boolean isEmpty() {
		return l.isEmpty();
	}

	private static int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int size = l.size();
			int res = l.get(size - 1);
			l.remove(size - 1);
			return res;
		}

	}

	private static void push(int e) {
		l.add(e);
	}

	private static int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int size = l.size();
			return l.get(size - 1);
		}
	}

}
