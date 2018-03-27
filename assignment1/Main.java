package assignment1;

public class Main {

	public static void main(String[] args) {
		/*
		double[][] ele = { { 1, 2 }, { 3, 4 } };
		double[][] ele2 = { { 5, 6 }, { 7, 8 } };

		Matrix a = new Matrix(ele);
		Matrix b = new Matrix(ele2);

		System.out.println(a.multiply(b).toString());
		*/
		
		StackDemo stack = new StackDemo();
		
		stack.Push(5,6,1);
		
		try {
			System.out.println(stack.Pop(3).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//TEST
