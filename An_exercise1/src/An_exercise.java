public class An_exercise {

	public static void main(String[] args) {
		System.out.println("Exercise #1.");	
		int q = (int)(5 + Math.random()*1000);
		int w = (int)(Math.random()*1000);
		double z = (double)q/w;
		System.out.println(String.format("1. q / w = %d / %d = %.3f.", q,w,z));
		z = (double)w/q;
		System.out.println(String.format("1. w / q = %d / %d = %.6f.\n", w,q,z));
		
		System.out.println("Exercise #2.");
		int n = (int)(10 + Math.random()*90);
		System.out.println(String.format("1. Random number it's: %d", n));
		int sum = n/10 + n%10;
		System.out.println(String.format("The sum of the numbers (%d, %d) of the number %d is: %d\n", n/10, n%10, n, sum));
		
		System.out.println("Exercise #3.");
		String str1 = "Hello", str2 = "World";
		String newStr = "";
		newStr = str1.concat(" " + str2);
		System.out.println(String.format("Your words: '%s' and '%s'.\nFull string: %s\n", str1, str2, newStr));
	}

}
