package Day8;

public class Pattern {

	public void starPattern(int num) {
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public void numPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void starPattern1(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public void starPattern2(int num) {
		int l = num;
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k < l; k++) {
				System.out.print(" ");
			}
			--l;
			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void starPattern3(int num) {
		int l = num;
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k < l; k++) {
				System.out.print(" ");
			}
			--l;
			for (int j = 0; j < i; j++) {

				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern pat = new Pattern();
		pat.starPattern(5);
		pat.numPattern(5);
		pat.starPattern1(5);
		pat.starPattern2(5);
		pat.starPattern3(5);
	}

}
