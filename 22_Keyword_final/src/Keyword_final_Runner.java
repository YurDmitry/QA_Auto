import java.text.DecimalFormat;

public class Keyword_final_Runner {
		
	public static void main(String[] srgs) {
		Country Belarus = new Country("Belarus", 207600, 8.32);
		Belarus.descrition();
			
		Country Russia = new Country("Russia", 17100000, 115.11);
		Russia.descrition();

		Country Belarus1 = new Country();
		Country Belarus2 = new Country("Belarus");
		Country Belarus3 = new Country("Belarus", 207600);
		Belarus1.descrition();
		Belarus2.descrition();
		Belarus3.descrition();
		
		System.out.println(Country.countCountry + "\n" + Country.getCountCountry());
	}
}

class Country{
	DecimalFormat dF = new DecimalFormat(".##");
	private String name;
	private int square;
	double QuantityPeople;
	static int countCountry=0;
	private static final int MILLION = 100000;	
	
	public Country() {
		name = "Nan";
		square = 0;
		QuantityPeople = 0;
		countCountry++;
	}
	
	public Country(String name) {
		this.name = name;
		square = 0;
		QuantityPeople = 0;
		countCountry++;
	}
	
	public Country(String name, int square) {
		this.name = name;
		this.square = square;
		QuantityPeople = 0;
		countCountry++;
	}
	
	public Country(String name, int square, double CountryQuantityPeople) {
		this.name = name;
		this.square = square;
		QuantityPeople = PeoplePerSquareMeter(CountryQuantityPeople);
		countCountry++;
	}
	
	void descrition() {
		System.out.println("Name of country: " + getName() + ".\nThe area of this country: " + getSquare() + ".\nPeople per square meter: " + dF.format(QuantityPeople) + ".\n");
	}
		
	void SetAllInformation(String CountryName, int CountrySquare, double CountryQuantityPeople) {
		name = CountryName;
		square = CountrySquare;
		QuantityPeople = PeoplePerSquareMeter(CountryQuantityPeople);
	}
		
	double PeoplePerSquareMeter(double QuantityPeople) {
		this.QuantityPeople = (QuantityPeople*MILLION)/square;
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
	
	public static int getCountCountry() {
		return countCountry;
	}
}
