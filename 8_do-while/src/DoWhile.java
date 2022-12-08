public class DoWhile {
	
	public static void main(String[] args) {
		System.out.print("Fibonacci numbers:\n");
		int i = 0;
		int n1 = 1, n2 = 1, n3;
		System.out.print(n1 + ", " + n2);
		do {
			n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
			i++;
		} while(i < 10);
		System.out.print(".");
	}
}
