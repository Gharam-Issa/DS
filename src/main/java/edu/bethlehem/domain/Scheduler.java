package edu.bethlehem.domain;

public class Scheduler {
	CircularLinkedList<Process> processes = new CircularLinkedList<>();

//	public void add(Process process) {
//		processes.add(process);
//	}

	public Scheduler(CircularLinkedList<Process> processes) {
		super();
		this.processes = processes;
	}

//	public void printList() {
//		for (int i = 0; i < processes.size(); i++) {
//			System.out.print(i);
//		}
//	}

	public void run() {
		// iretate over elemnts and execute each one of them
//		int count = 5;
//		for (int i = 0; i < processes.size(); i++) {
//			if (processes.size() != 0) {
//				System.out.println(1);
//				processes.get(i).execute(5);
//				if (processes.get(i).finished()) {
//					processes.remove(i);
//				}
//				System.out.println(2);
//				 processes.rotate();
//			}
//			printList();
//			System.out.println();
//			System.out.println(count++);
//		}
		int count = 5;
//		if(processes.size() != 0) {
//			for (int i = 0; i < processes.size(); i++) {
//				processes.get(i).execute(5);
//			}
//			for (int i = 0; i < processes.size(); i++) {
//				if (processes.get(i).finished()) {
//					processes.remove(i);
//				}
//			}
//			count++;
//			System.out.println(count);
//		}

//		for (int i = 0; i < processes.size(); i++) {
//			if (processes.size() != 0) {
//				for (int j = 0; j < processes.size(); j++) {
//					processes.get(j).execute(5);
//				}
//				for (int k = 0; k < processes.size(); k++) {
//					if (processes.get(k).finished()) {
//						processes.remove(k);
//
//					}
//				}
//				count++;
//				System.out.println(count);
//				System.out.println("the list size is : "+processes.size());
//				
//			}
//
//			else
//				System.out.println("the list is empty");
//		}
		if (processes.size() == 0) {
			System.out.println("the list is empty");
		} else {
			for (int i = 0; i < processes.size(); i++) {
				for (int j = 0; j < processes.size(); j++) {
					processes.get(j).execute(5);
				}
				for (int k = 0; k < processes.size(); k++) {
					if (processes.get(k).finished()) {
						processes.remove(k);

					}
				}
				count++;
				System.out.println(count);
				System.out.println("the list size is : " + processes.size());
			}

		}
	}
}
