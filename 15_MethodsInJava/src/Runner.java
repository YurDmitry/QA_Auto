public class Runner {
	
	public static void main(String[] srgs) {
		Country Belarus = new Country();
		Belarus.name = "Belarus";
		Belarus.square = 207600;
		
		Country Russia = new Country();
		Russia.name = "Russia";
		Russia.square = 17100000;
		
		Belarus.descrition();
		Russia.descrition();
	}
}

class Country{
	String name;
	double square;
	void descrition() {
		System.out.println("Name of country: " + name + ". The area of this country: " + square);
	}
}