package Day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class counter1 {
	int c = 0;

	synchronized void increment() throws InterruptedException {

		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(100);
			c++;
			System.out.println(c);
		}

	}
}

class objectCreate1 implements Runnable {
	counter1 c = new counter1();

	@Override
	public void run() {

		try {
			c.increment();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class ExecutorsExample {

	public static void main(String[] args) throws InterruptedException {

		objectCreate1 o = new objectCreate1();
		
		//ExecutorService exe = Executors.newFixedThreadPool(5);
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println(core);
		ExecutorService exe = Executors.newFixedThreadPool(core);
		
		for(int i = 0; i<5;i++)
		{
			exe.execute(o);
		}
		
		exe.shutdown();

	}

}