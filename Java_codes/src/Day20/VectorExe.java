package Day20;

import java.util.Vector;

public class VectorExe implements Runnable {
	Vector<Integer> vector = new Vector<>();
@Override
	public void run() {
	
		for (int i = 0; i < 5; i++) {
			vector.add(i);
		}
		System.out.println(vector);
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
Thread t1 = new Thread(new VectorExe());
Thread t2 = new Thread(new VectorExe());
t1.start();
t2.start();

	}


}
