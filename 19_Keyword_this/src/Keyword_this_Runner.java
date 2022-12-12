import java.text.DecimalFormat;

public class Keyword_this_Runner {
	
	public static void main(String[] srgs) {
		Country Belarus = new Country();
		Belarus.SetAllInformation("Belarus", 207600, 8.32);
		Belarus.descrition();
		
		Country Russia = new Country();
		Russia.SetAllInformation("Russia", 17100000, 115.11);
		Russia.descrition();
		
		Belarus.PeoplePerSquareMeter(9.42);
		Russia.PeoplePerSquareMeter(144.7);
		
		Belarus.descrition();
		Russia.descrition();
	}
}

class Country{
	DecimalFormat dF = new DecimalFormat(".##");
	private String name;
	private int square;
	double QuantityPeople;
	
	void descrition() {
		System.out.println("Name of country: " + getName() + ".\nThe area of this country: " + getSquare() + ".\nPeople per square meter: " + dF.format(QuantityPeople) + ".\n");
	}
	
	void SetAllInformation(String CountryName, int CountrySquare, double CountryQuantityPeople) {
		name = CountryName;
		square = CountrySquare;
		QuantityPeople = PeoplePerSquareMeter(CountryQuantityPeople);
	}
	
	double PeoplePerSquareMeter(double QuantityPeople) {
		this.QuantityPeople = (QuantityPeople*1000000)/square;
		return this.QuantityPeople;
	}
	
	public int getSquare() {
	      return square;
	}

	 public String getName() {
	      return name;
	 }
	 
	 public void setSquare(int square) {
		 this.square = square;
	   }

	 public void setName(String name) {
	      this.name = name;
	 }
}
