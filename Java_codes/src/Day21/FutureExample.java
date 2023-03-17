package Day21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class counter2 {
	int c = 0;

	synchronized int increment() throws InterruptedException {

		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(100);
			c++;
		}
		return c;

	}
}

class objectCreate2 implements Callable<Integer> {
	counter2 c = new counter2();

	@Override
	public Integer call() throws InterruptedException {

		return c.increment();

	}

}

public class FutureExample {

	public static void main(String[] args) throws InterruptedException {

		objectCreate2 o = new objectCreate2();

		// ExecutorService exe = Executors.newFixedThreadPool(5);
		ExecutorService exe = Executors.newFixedThreadPool(10);

		List<Future> list = new ArrayList<>();
		for(int i =0;i<=5;i++)
		{
			Future<Integer> future = exe.submit(o);
			list.add(future);
			
		}
			
	
			try {
				for(Future f : list)
				{
					System.out.println("hi"+f.get());
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {

				e.printStackTrace();
			}
		

		exe.shutdown();

	}

}