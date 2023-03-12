package Day21;
class car extends Thread
{@Override
	public void run()  {
		System.out.println("hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		car c = new car();
		c.start();
		
		
		c.join();
		System.out.println("main");
	
		

	}

}
