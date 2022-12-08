import java.text.DecimalFormat;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat(".#");
		System.out.println("This is a mini calculator.\nEnter two numbers and an action " +
				"(\"-\" - minus, \"+\" - plus, \"*\" - multiply, \"/\" - divide)");
		System.out.println("Input number one: ");
		double a = sc.nextDouble();
		System.out.println("Input number one: ");
		double b = sc.nextDouble();
		double res;
		System.out.println("Input action: ");
		String action = sc.next();
		switch(action) {
		case "+" : {
			res = a + b;
			System.out.println("a + b = " + dF.format(res));
		} break;
		case "-" : {
			res = a - b;
			System.out.println("a - b = " + dF.format(res));
		} break;
		case "*" : {
			res = a * b;
			System.out.println("a / b = " + dF.format(res));
		} break;
		case "/" : {
			res = a / b;
			System.out.println("a * b = " + dF.format(res));
		} break;
		default : System.out.println("Your symbol isn't logic!");
		sc.close();
		}
	}

}
