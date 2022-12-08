public class stringLesson {
	
	public static void main(String[] strg) {
		String name = "My name is Dmitry.";
		int len = name.length();
		System.out.println(name + "\nLength of this string: " + len);
		String str1 = "\nHey all.".concat(name);
		System.out.println(str1);
		char[] charArr = name.toCharArray();
		for (int i=0; i<name.length(); i++) {
			System.out.println(charArr[i]);
		}
	}
}
