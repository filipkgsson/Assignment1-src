package assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

public class StackDemoTest {

	StackDemo stack;

	@Before
	public void setUp() throws Exception {
		stack = new StackDemo();
	}

	@Test
	public void testPush() {
		assertTrue(stack.size() == 0);
		stack.push(1, 2, 3);
		assertTrue(stack.size() == 3);
	}

	@Test
	public void testPop() {
		stack.push(1, 2, 3);
		ArrayList<Integer> list = stack.pop(3);
		assertEquals(1, (int) list.get(0));
		assertEquals(2, (int) list.get(1));
		assertEquals(3, (int) list.get(2));
		assertTrue(stack.size() == 0);
	}

	@Test(expected = AssertionError.class)
	public void testPopZero() {
		stack.pop(1);
	}
}
