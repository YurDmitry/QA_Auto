public class ClassesAndObjects {
	
	public static void main(String[] srgs) {
		Country Belarus = new Country();
		Belarus.name = "Belarus";
		Belarus.square = 207600;
		
		Country Russia = new Country();
		Russia.name = "Russia";
		Russia.square = 17100000;
		
		System.out.println("Name of country: " + Belarus.name + ". The area of this country: " + Belarus.square);
		System.out.println("Name of country: " + Russia.name + ". The area of this country: " + Russia.square);
	}
}

class Country{
	String name;
	double square;
}