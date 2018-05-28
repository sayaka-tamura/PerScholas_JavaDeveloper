package simpleThreadPack;

import java.lang.Thread.State;

public class InterruptedThread implements Runnable {
	
	public static void main(String[] args) throws InterruptedException{

		Thread ownThread = new Thread(new InterruptedThread(), "Thread to be interrupted");
		
		System.out.println("Started onThread");
		ownThread.start();	// run method start
		System.out.println("Main going to sleep for 3 secs");
		System.out.println("About to interupt ownThread");
		Thread.sleep(3000);
		ownThread.interrupt();
		Thread.sleep(5);
		ownThread.interrupt();
	}

	@Override
	public void run() {
		int counter = 5;
		int sub = 10;
		int result = counter-- - --sub; //5-- - --10
		System.out.println(counter);
		
		int rep =  counter-- - --counter;	// 4-2
		System.out.println("rep = " + rep);
		System.out.println("result = " + result);
		
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " was interrupted");
		}
		
		while(!Thread.interrupted()) {
			System.out.println("In while loop");
		}
		System.out.println(Thread.currentThread().getName() + " About to finished");
	}
}
