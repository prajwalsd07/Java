package Day10;

public class counter {
	int x = 0;

	synchronized void count() {
		for (int i = 0; i < 5; i++) {
			++x;
		}
		System.out.println(x + Thread.currentThread().getName());
	}

}
