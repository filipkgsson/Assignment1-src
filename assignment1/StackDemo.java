package assignment1;

import java.util.*;

public class StackDemo extends Stack<Integer> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public void push(int... elements) {
		for (int e : elements) {
			this.push(e);
		}
	}

	public ArrayList<Integer> pop(int n) {
		assert this.size() >= n;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(0, this.pop());
		}
		return list;
	}
}