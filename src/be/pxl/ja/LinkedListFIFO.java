package be.pxl.ja;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListFIFO {

	public static void main(String[] args) {
		Queue<String> elements = new LinkedList<>();
		elements.offer("One");
		elements.offer("One");
		elements.offer("Two");
		elements.offer(null);
		elements.offer("Three");

		while (!elements.isEmpty()) {
			System.out.println(elements.remove());
		}

		Deque<String> deque = new LinkedList<>();
		deque.push("One");
		deque.push("One");
		deque.push("Two");
		deque.push(null);
		deque.push("Three");

		while (!deque.isEmpty()) {
			System.out.println(deque.poll());
		}
	}

}
