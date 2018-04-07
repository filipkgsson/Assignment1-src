package assignment1;

import java.util.*;

public class StackDemo extends Stack<Integer> {

	private static final long serialVersionUID = 1L;

	/**
	 * Append n elements at head of stack.
	 * 
	 * @param elements the elements to append
	 */
	public void push(int... elements) {
		for (int e : elements) {
			this.push(e);
		}
	}
	
	/**
	 * Remove n objects from head.
	 * 
	 * @return the objects that has been removed from the queue
	 * @precondition size() >= n
	 */
	public ArrayList<Integer> pop(int n) {
		assert this.size() >= n;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(0, this.pop());
		}
		return list;
	}
}