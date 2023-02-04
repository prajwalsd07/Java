package Day9;

public class main {

	public static void main(String[] args) throws InterruptedException {
		counter c = new counter();

		Thread t = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			c.count1();
		});
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			c.count1();
		});
		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			c.count1();
		});

		new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			c.count1();
		}).start();

		t.start();
		t1.start();
		t2.start();

		t.setName("llllllllll");
		t1.setName("jjjjjjjjjj");
		t2.setName("kkkkkkkkkk");
		t.setPriority(3);
		t.join();
		System.out.println(Thread.currentThread().getName());

		System.out.println("everyone");

	}

}
