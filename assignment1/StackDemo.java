package assignment1;

import java.util.*;

public class StackDemo {

	private Stack<Integer> stack;

	public StackDemo() {
		stack = new Stack<Integer>();
	}

	public void Push(int e) {
		stack.push(e);
	}

	public void Push(int... elements) {
		for (int e : elements) {
			stack.push(e);
		}
	}

	public int Pop() {
		return stack.pop();
	}

	public ArrayList<Integer> Pop(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(0, stack.pop());
		}
		return list;
	}
}
