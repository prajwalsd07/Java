package Day6;

import java.util.Random;

public class Rando {

	double rand()
	{
		
		return Math.random()*(150-100+1)+100;
		
	}
	public static void main(String[] args) {
		Rando r = new Rando();
		Random r1 = new Random(); 
		System.out.println(r1.nextInt(20));   // using random class
;		System.out.println(r.rand());   // using math.random
		
	}

}
