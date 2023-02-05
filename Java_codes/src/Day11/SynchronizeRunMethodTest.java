package Day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasktest{
	static synchronized void test()
	{
		System.out.println(Thread.currentThread().getName() + " is starting");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " is running");
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " is finished");
	}
}
public class SynchronizeRunMethodTest implements Runnable {
	Tasktest tas = new Tasktest();
	public void run() {
		
		tas.test();
	}

	public static void main(String[] args) {
		
		
		ExecutorService service  = Executors.newFixedThreadPool(10);
		for(int i=0;i<14;i++)
		{
		service.execute(new SynchronizeRunMethodTest() );
		}
		
		/*
		 * SynchronizeRunMethodTest test = new SynchronizeRunMethodTest(); Thread t1 =
		 * new Thread(test); Thread t2 = new Thread(test); t1.start(); t2.start();
		 */
	}
}