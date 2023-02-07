package Day11;

class Outside {

	public interface inner {
		void show();
	}

	public class smallclass implements inner {

		@Override
		public void show() {
			System.out.println("i am inside inner");

		}
	}
}

public class Bigclass {

	class InsideBig implements Outside.inner {

		@Override
		public void show() {
			System.out.println("i am inside big");

		}
	}

	public static void main(String[] args) {

		Outside c = new Outside();
		Outside.smallclass s = c.new smallclass();
		Outside.inner n = c.new smallclass();
		n.show();
		Bigclass b = new Bigclass();
		Bigclass.InsideBig i = b.new InsideBig();
		i.show();

	}

}
