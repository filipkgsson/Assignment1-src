package assignment1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		BoundedQueue<Integer> bq = new BoundedQueue<Integer>(5);
		bq.remove();
		bq.add(1);
		bq.add(2);
		bq.add(3);
		bq.add(4);
		bq.add(5);
		bq.add(6);
		bq.remove();
		bq.remove();
		bq.add(8);
		bq.add(7);
		bq.add(10);
		Iterator<Integer> itr = bq.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	
		*/
		/*
		double[][] ele = { { 1, 2 }, { 3, 4 } };
		double[][] ele2 = { { 5, 6 }, { 7, 8 } };

		Matrix a = new Matrix(ele);
		Matrix b = new Matrix(ele2);

		System.out.println(a.multiply(b).toString());
		*/
		String[] a = new String[0];
		System.out.println(a.length);
		MessageStack mStack = new MessageStack();
		
		System.out.println(mStack.size());
		mStack.add(new Message("Hej"));
		System.out.println(mStack.size());
	}

}
