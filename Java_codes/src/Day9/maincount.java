package Day9;

public class maincount {

	public static void main(String[] args) {
		counter c = new counter();
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				c.count1();
			}
		}).start();
		
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				c.count1();
			}
		}).start();
		
		

	}

}
