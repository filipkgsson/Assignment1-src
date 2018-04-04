package assignment1;

import java.util.*;

/**
 * A first-in, first-out bounded collection of objects.
 */
public class BoundedQueue<E> extends AbstractCollection<E> {
	/**
	 * Constructs an empty queue.
	 * 
	 * @param capacity
	 *            the maximum capacity of the queue
	 * @precondition capacity > 0
	 */
	public BoundedQueue(int capacity) {
		assert (capacity > 0) : "Capacity must be greater than 0";
		elements = new Object[capacity];
		count = 0;
		head = 0;
		tail = 0;
	}

	public Iterator<E> iterator() {
		return new Iterator<E>() {
			public boolean hasNext() {
				return visited < count;
			}

			public E next() {
				int index = (head + visited) % elements.length;
				@SuppressWarnings("unchecked")
				E r = (E) elements[index];
				visited++;
				return r;
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

			private int visited = 0;
		};
	}

	/**
	 * Remove object at head.
	 * 
	 * @return the object that has been removed from the queue
	 * @precondition size() > 0
	 */
	public E remove() {
		assert this.size() > 0 : "Size must be greater than 0";
		@SuppressWarnings("unchecked")
		E r = (E) elements[head];
		head = (head + 1) % elements.length;
		count--;
		return r;
	}

	/**
	 * Append an object at tail.
	 * 
	 * @param anObject
	 *            the object to be appended
	 * @return true since this operation modifies the queue. (This is a requirement
	 *         of the collections framework.)
	 */
	public boolean add(E anObject) {
		if(this.isFull()) {
			Object[] temp = new Object[elements.length + 1];
			if(tail == 0) {
				System.arraycopy(elements, 0, temp, 0, elements.length);
				tail = elements.length;
			}
			else {
				System.arraycopy(elements, 0, temp, 0, tail);
				System.arraycopy(elements, head, temp, tail + 1, elements.length - tail);
				head ++;
			}
			elements = temp;
		}
		elements[tail] = anObject;
		tail = (tail + 1) % elements.length;
		count++;
		return true;
	}

	public int size() {
		return count;
	}

	/**
	 * Checks whether this queue is full.
	 * 
	 * @return true if the queue is full
	 */
	public boolean isFull() {
		return count == elements.length;
	}

	/**
	 * Gets object at head.
	 * 
	 * @return the object that is at the head of the queue
	 * @precondition size() > 0
	 */
	@SuppressWarnings("unchecked")
	public E peek() {
		assert this.size() > 0 : "Size must be greater than 0";
		return (E) elements[head];
	}

	private Object[] elements;
	private int head;
	private int tail;
	private int count;
}