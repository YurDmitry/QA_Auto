public class ArrayInJava {
	
	public static void main(String[] args) {
		int[] intArray = {14, 22, 32, 41, 55, 68};
		
		System.out.println("Array: ");
		for(int element : intArray) {
	         System.out.print(element + " ");
	    }
		
		String[] strArray = {"List of even numbers: ","\nList of odd numbers: "};
		
		System.out.println("\n\n" + strArray[0]);
		for(int i = 0; i < intArray.length; i++) {	
			if (intArray[i] % 2 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
		
		System.out.println("\n" + strArray[1]);
		for(int i = 0; i < intArray.length; i++) {	
			if (intArray[i] % 2 != 0) {
				System.out.print(intArray[i] + " ");
			}
		}
	}
}
