package edu.bethlehem.domain;

public class Test extends Scheduler {

	public Test(CircularLinkedList<Process> processes) {
		super(processes);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList<Process> list = new CircularLinkedList<>();
		Process p1 = new Process(10);
		Process p2 = new Process(20);
		Process p3 = new Process(5);
		Process p4 = new Process(1);
		Process p5 = new Process(15);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		Scheduler scheduler = new Scheduler(list);
		scheduler.run();
//		scheduler.printList();
	

	}

}
