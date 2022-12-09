import java.text.DecimalFormat;

public class Runner17 {
	
	public static void main(String[] srgs) {
		Country Belarus = new Country();
		Belarus.SetNameSquarePpsm("Belarus", 207600, 8.32);
		Belarus.descrition();
		
		Country Russia = new Country();
		Russia.SetNameSquarePpsm("Russia", 17100000, 115.11);
		Russia.descrition();
		
		Belarus.PeoplePerSquareMeter(9.42);
		Russia.PeoplePerSquareMeter(144.7);
		
		Belarus.descrition();
		Russia.descrition();
	}
}

class Country{
	DecimalFormat dF = new DecimalFormat(".##");
	String name;
	int square;
	double QuantityPeople;
	
	void descrition() {
		System.out.println("Name of country: " + name + ".\nThe area of this country: " + square + ".\nPeople per square meter: " + dF.format(QuantityPeople) + ".\n");
	}
	
	void SetNameSquarePpsm(String CountryName, int CountrySquare, double CountryQuantityPeople) {
		name = CountryName;
		square = CountrySquare;
		QuantityPeople = PeoplePerSquareMeter(CountryQuantityPeople);
	}
	
	double PeoplePerSquareMeter(double quantity) {
		this.QuantityPeople = (quantity*1000000)/square;
		return QuantityPeople;
	}
}