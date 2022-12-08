public class BreakeContinue {
	public static void main(String[] args) {
		System.out.print("Drawing a figure from asterisks:\n");
		int k = 0;
		for(int i = 0; i < 20; i++) {
			if (k == 16) {
				break;
			}
			System.out.print("\t\t");
			for(int n = 0; n < 16; n++) {
				if (k < n) {
					break;
				}
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
		k--;
		for(int i = 0; i < 15; i++) {
			System.out.print("\t\t");
			for(int n = 15; n >= 0; n--) {
				if (k <= n) {
					continue;
				}
				System.out.print("*");
			}
			k--;
			System.out.println();
		}
	}
}
