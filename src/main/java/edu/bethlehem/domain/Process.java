package edu.bethlehem.domain;

public class Process {
	private int duration;
	private int remainingDuration;

	public Process(int duration) {
		super();
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setRemainingDuration(int remainingDuration) {
		this.remainingDuration = remainingDuration;
	}

	public int getRemainingDuration() {
		return remainingDuration;
	}


	public void execute(int quantum) {
		setRemainingDuration(getDuration() - quantum);
		
//		try {
//			Thread.sleep(quantum*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public boolean finished() {
		if (getRemainingDuration() <= 0)
			return true;
		else
			return false;
	}
}
