package com.solutiontest.common.testproject.thread;

public class ThreadSync {

	private static int count = 4;
	private final static int maxThread = 4;
	
	public void getBlockedSession() {
		
		synchronized (this) {
			while(count == 0) {
				try {
					System.out.println("While Loop.... Blocking the session....");
					wait();
				}catch (Exception e) {
					System.out.println("Exception... : "+e.getMessage());
				}
			}
			
			if(count > 0 && count <=maxThread) {
				createSession();
			}			
		}
	}
	
	private void createSession() {
		System.out.println("getting the session...");
		count--;
	}
	
	public void releaseSession() {
		synchronized (this) {
			System.out.println("Releasing the sessions.....");
			count++;
			notify();
		}
	}
	
	public void getNonBlockingSession() throws InterruptedException {
		synchronized (this) {
			if(count >0 && count <=maxThread) {
				System.out.println("getting the non block sessions.....");
				createSession();
				wait(2000);
			}
		}
	}
	
	public int printStat() {
		System.out.println("Count : "+count);
		return count;
	}
	
}
