package com.solutiontest.common.testproject.thread;

public class JoinDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Dinesh on Java " + i +" - "+ getName());
		}
	}
	
	public static void main(String[] args) {
		JoinDemo j1 = new JoinDemo();
		j1.setName("A");
		
		JoinDemo j2 = new JoinDemo();
		j2.setName("B");
		
		JoinDemo j3 = new JoinDemo();
		j3.setName("C");
		
		
		j1.start();
		
		try {
			j1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		j2.start();
		j3.start();
	}
}

