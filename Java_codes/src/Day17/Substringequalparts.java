package Day17;

public class Substringequalparts {
	void Substr(String str, int num) {
		int length = str.length();

		String subs[] = new String[num];
		int temp = 0;
		if (length % num == 0) {
			int interval = length / num;
			for (int i = 0; i < length; i = i + interval) {
				subs[temp] = str.substring(i, i + interval);
				temp++;

			}
			for (int i = 0; i < subs.length; i++) {
				System.out.println(subs[i]);
			}
		} else {
			System.out.println("cant devide");
		}
	}

	public static void main(String[] args) {

		Substringequalparts s = new Substringequalparts();
		s.Substr("helloomydeare", 3);
	}

}