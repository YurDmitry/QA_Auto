import java.text.DecimalFormat;
public class Main {
    public static void main(String[] srgs) {
        Country Belarus = new Country("Belarus", 207600, 8.32);
        System.out.println(Belarus.toString());

        Country Russia = new Country("Russia", 17100000, 115.11);
        System.out.println(Russia.toString());

        Country Belarus1 = new Country();
        Country Belarus2 = new Country("Belarus");
        Country Belarus3 = new Country("Belarus", 207600);
        System.out.println(Belarus1.toString());
        System.out.println(Belarus2.toString());
        System.out.println(Belarus3.toString());
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

    public String toString() {
        return ("Name of country: " + getName() + ".\nThe area of this country: " + getSquare() + ".\nPeople per square meter: " + dF.format(QuantityPeople) + ".\n");
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
