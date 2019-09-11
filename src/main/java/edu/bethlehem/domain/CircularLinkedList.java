package edu.bethlehem.domain;

public class CircularLinkedList<T> extends LinkedList<T> implements CircularList<T> {

	@Override
	public void add(T x) {
		super.add(x);
		getTail().setNext(getHead());
	}

	@Override
	public void add(int index, T x) {
		super.add(index, x);
		if (index == 0)
			getTail().setNext(getHead());
		;
	}

	@Override
	public void rotate() {
		if (size() <= 0)
			throw new NullPointerException("The list is empty");
		else {
			setHead(getHead().getNext());
			setTail(getTail().getNext());
		}
	}

}
