public class Runner16 {
	
	public static void main(String[] srgs) {
		Country Belarus = new Country();
		Belarus.name = "Belarus";
		Belarus.square = 207600;
		Belarus.PeoplePerSquareMeter(9.42);
		
		Country Russia = new Country();
		Russia.name = "Russia";
		Russia.square = 17100000;
		Russia.PeoplePerSquareMeter(144.7);
		
		Belarus.descrition();
		Russia.descrition();
	}
}

class Country{
	String name;
	double square;
	double QuantityPeople;
	
	void descrition() {
		System.out.println("Name of country: " + name + ".\nThe area of this country: " + square + ".\nPeople per square meter: " + QuantityPeople + ".\n");
	}
	
	double PeoplePerSquareMeter(double quantity) {
		this.QuantityPeople = (quantity*1000000)/square;
		return QuantityPeople;
	}
}