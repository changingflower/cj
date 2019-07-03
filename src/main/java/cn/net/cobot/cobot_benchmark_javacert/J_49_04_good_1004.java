package cn.net.cobot.cobot_benchmark_javacert;
import java.util.EmptyStackException;

public class J_49_04_good_1004 {
	private Object[] elements;
	private int size = 0;

	public J_49_04_good_1004(int initialCapacity) {
		this.elements = new Object[initialCapacity];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException(); // Ensures object consistency
		}
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;	//ok
	}

	/*
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size) {
			Object[] oldElements = elements;
			elements = new Object[2 * elements.length + 1];
			System.arraycopy(oldElements, 0, elements, 0, size);
		}
	}
}