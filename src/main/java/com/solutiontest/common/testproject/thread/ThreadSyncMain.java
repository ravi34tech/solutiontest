package com.solutiontest.common.testproject.thread;

public class ThreadSyncMain {
	
	

	public static void main(String[] args) throws InterruptedException {
		final ThreadSync sync = new ThreadSync();
		sync.getNonBlockingSession();
		sync.printStat();

		for(int i=0; i<6 ; i++) {
			Thread r = new Thread() {
				public void run() {
					System.out.println("-------");
					sync.getBlockedSession();
					sync.printStat();
					System.out.println("-------");
				}
			};
			r.start();
			int count = sync.printStat();
			if(count == 0) {
				int waitVal = 0;
				for(long j =0; j <1000000000 ; j++) {
					waitVal++;
				}
				System.out.println("Valu : "+waitVal);
				sync.releaseSession();
				sync.printStat();
			}
			System.out.println("Loop int -I- value is  :"+i);
		}
		
		
		Thread r2 = new Thread() {
			public void run() {
				try {
					System.out.println("Waitiing..............");
					wait(100);
				} catch (Exception e) {
					e.printStackTrace();
				} 
				System.out.println("############ Releaseing whole session ###");
				sync.releaseSession();
				sync.printStat();
			}
		};
		r2.start();
		
		
	}
	
	

}
