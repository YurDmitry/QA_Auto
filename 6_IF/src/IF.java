import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		System.out.println("Input 3 sides of triangle.");
		System.out.println("Input A: ");
		int a = sc.nextInt();
		System.out.println("Input B: ");
		int b = sc.nextInt();
		System.out.println("Input C: ");
		int c = sc.nextInt();
		if ((a + b <= c) || (a + c <= b) || (c + b <= a)) {
			System.out.println("The triangle doesn't exist.");
		} else if (a == b && a == c) {
			System.out.println("The triangle is equilateral.");
		} else if (a == b || a == c) {
			System.out.println("The triangle is isosceles.");
		} else {
			System.out.println("The triangle is common.");
		}
		sc.close();
	}
}
