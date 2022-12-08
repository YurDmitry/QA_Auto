import java.util.Scanner;

public class SCanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input something: ");
		String str = sc.nextLine();
		System.out.println("Yuor line: " + str + ".");
		sc.close();
	}
}
