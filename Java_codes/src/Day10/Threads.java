package Day10;

public class Threads implements Runnable {

	counter c = new counter();

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		c.count();

	}

}
