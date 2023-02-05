package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Call implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}

}

public class FutureLearn {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Call call = new Call();
		
		ExecutorService exe = Executors.newFixedThreadPool(10);
		
		List<Future> list = new ArrayList<>();
		for(int i =0;i<14;i++) {
		Future<Integer> future = exe.submit(call);
		list.add(future);
	}
		for(Future f : list)
		{
			System.out.println(f.get());
		}
		

}
}
