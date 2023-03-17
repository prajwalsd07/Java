package Day21;

class counter {
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

class objectCreate implements Runnable {
	counter c = new counter();

	@Override
	public void run() {

		try {
			c.increment();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {

		objectCreate o = new objectCreate();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o);
		Thread t3 = new Thread(o);
		Thread t4 = new Thread(o);
		Thread t5 = new Thread(o);
t1.setName("1st thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join();
		t2.setPriority(2);
		t3.setPriority(1);
		t4.setPriority(2);
		t5.setPriority(3);
		t1.setPriority(1);
		System.out.println("end");

	}

}