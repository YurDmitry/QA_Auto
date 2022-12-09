public class multidimensionalArrays {
	
	public static void main(String[] args) {
		int[][] intArrayOne = {{1, 2, 3, 4, 5, 6},
				            {5, 6, 7, 8, 9, 10},
							{11, 12, 13, 14, 15, 16}};
		
		
		int[][] intArrayTwo = {{2, 3, 4, 5, 6, 7},
							   {8, 9, 10, 11, 12, 13},
							   {14, 15, 16, 17, 18, 19}};
		
		System.out.println("First array:");
		for(int i = 0; i < intArrayOne.length; i++) {
			for(int n = 0; n < intArrayOne[i].length; n++) {
				System.out.print(intArrayOne[i][n] + " ");
			}
			System.out.println();
		}
		System.out.println("\nSecond array:");
		for(int i = 0; i < intArrayTwo.length; i++) {
			for(int n = 0; n < intArrayTwo[i].length; n++) {
				System.out.print(intArrayTwo[i][n] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nResult array:");
		int multiplication;
		for(int i = 0; i < intArrayOne.length; i++) {
			for(int n = 0; n < intArrayOne[i].length; n++) {
				multiplication = intArrayOne[i][n] * intArrayTwo[i][n];
				System.out.print(multiplication + " ");
			}
			System.out.println();
		}
	}
}
