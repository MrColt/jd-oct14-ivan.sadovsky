package day7.structureclass;

import java.util.Iterator;

public class SimpleLinkedList implements Iterable<Object> {

	private Node root;

	private int size;

	public SimpleLinkedList() {
		size = 0;
	}

	public void addFirst(Object obj) {
		Node n = new Node();
		n.obj = obj;

		if (root != null) {
			n.ref = root;
		}
		root = n;
		size++;
	}

	public void addLast(Object obj) {
		Node n = new Node();
		n.obj = obj;

		if (root == null) {
			root = n;
		} else {
			Node last = root;
			Node cp = root;
			while (cp.ref != null) {
				last = cp;
				cp = cp.ref;
			}
			last.ref = n;
		}
		size++;
	}

	public void addAfter(Object obj, Object prev) {
		Node prevPointer = null;
		Node cp = root;

		do {
			if (cp.obj == prev) {
				prevPointer = cp;
				break;
			}
			cp = cp.ref;
		} while (cp != null && cp.ref != null);

		if (prevPointer == null) {
			throw new IllegalStateException(
					"List does not contain prev object.");
		}
		Node n = new Node();
		n.obj = obj;

		if (prevPointer.ref != null) {
			n.ref = prevPointer.ref;
		}
		prevPointer.ref = n;

		size++;
	}

	public void printList() {
		if (size == 0) {
			System.out.println("List is empty");
		}

		System.out.print("{ ");
		Node cp = root;
		while (cp.ref != null) {
			System.out.print(cp.obj + ", ");
			cp = cp.ref;
		}
		System.out.print(cp.obj);
		System.out.println(" }");
	}

	public int getSize() {
		return size;
	}

	private class Node {
		Object obj;
		Node ref;
	}

	@Override
	public Iterator<Object> iterator() {

		return new SLLIterator();
	}

	class SLLIterator implements Iterator<Object> {
		private Node prev;
		private Node cp;

		public SLLIterator() {

		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (cp == null && root != null)
					|| (cp != null && cp.ref != null);
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (cp == null && root != null) {
				// first
				cp = root;
				return cp.obj;
			}
			if (hasNext()) {
				prev = cp;
				cp = cp.ref;
				return cp.obj;
			}
			throw new IllegalStateException("List has no more elements");

		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			if (!hasNext() && prev == null) {
				// only 1 element
				cp = null;
				root = null;
			} else if (!hasNext() && prev != null) {
				// last element
				prev.ref = null;
				cp = null;
			} else if (hasNext() && prev == null) {
				// first element
				root = cp.ref;
				cp = root;
			} else {
				// middle element
				prev.ref = cp.ref;
				cp = cp.ref;
			}
			size--;
		}

	}

}
