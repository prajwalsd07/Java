package Day10;

public class ThreadsMain {

	public static void main(String[] args) 
	{ 
		Threads o = new Threads();
		
		
		Thread t = new Thread(o);
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o);
		t.setName("raj");
		t1.setName("boj");
		t2.setName("kuj");
		t.setPriority(9);
		t2.setPriority(1);
		t1.setPriority(4);
		t.start();
	t1.start();
	t2.start();
	
		
	}

}
