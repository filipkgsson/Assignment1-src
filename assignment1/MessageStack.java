package assignment1;

import java.util.*;

public class MessageStack extends Stack<Message> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	/**
	 * Push multiple messages.
	 * 
	 * @param newMessages
	 *            the messages to be appended
	 */
	public void push(int... elements) {
		for (int e : elements) {
			this.push(e);
		}
	}

	/**
	 * Pop multiple messages.
	 * 
	 * @return messages requested as an ArrayList
	 * @precondition size() > 0
	 */
	public ArrayList<Message> pop(int n) {
		assert this.size() >= n;
		ArrayList<Message> list = new ArrayList<Message>();
		for (int i = 0; i < n; i++) {
			list.add(0, this.pop());
		}
		return list;
	}
}