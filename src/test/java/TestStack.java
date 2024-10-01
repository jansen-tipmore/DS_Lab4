import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {

	@Test
	public void PushTest() {
		MyStack<String> A = new MyStack<String>();
		A.push("a");
		assertEquals(A.top(), "a");
	}
	
	@Test
	public void TopTest() {
		MyStack<String> B = new MyStack<String>();
		assertThrows (StackUnderFlowException.class, () -> {B.top();});
		B.push("b");
		assertEquals(B.top(), "b");

	}
	
	@Test
	public void PopTest() {
		MyStack<String> C = new MyStack<String>();
		assertThrows (StackUnderFlowException.class, () -> {C.pop();});
		C.push("a");
		C.push("b");
		C.push("c");
		assertEquals(C.pop(), "c");
		assertEquals(C.pop(), "b");
		assertEquals(C.pop(), "a");
		assertTrue(C.isEmpty());
	}
	
	@Test
	public void IsEmptyTest() {
		MyStack<String> D = new MyStack<String>();
		assertTrue(D.isEmpty());

	}
	

}
