package Day11;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
@Override
	public synchronized void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"is started");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"is finished");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(new Random().nextInt());
	}

}

public class Executor {

	public static void main(String[] args) {
		Task tas = new Task();
		/*
		 * Thread t1 = new Thread(tas); Thread t2 = new Thread(tas); Thread t3 = new
		 * Thread(tas); Thread t4 = new Thread(tas);
		 * 
		 * t1.start(); t2.start(); t3.start(); t4.start();
		 */
		

		ExecutorService exe = Executors.newFixedThreadPool(10);
		
		for(int i =0;i<14;i++) {
		exe.execute(tas);
		}

	}
}

