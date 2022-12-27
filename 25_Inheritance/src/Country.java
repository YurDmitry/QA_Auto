public class Country extends CountryOptions{
    protected double QuantityPeople;
    private static final int MILLION = 100000;

    public Country() {
        super("Nan", 0);
        QuantityPeople = 0;
    }
    public Country(String name) {
        super(name, 0);
        QuantityPeople = 0;
    }
    public Country(String name, int square) {
        super(name, square);
        QuantityPeople = 0;
    }

    public Country(String name, int square, double CountryQuantityPeople) {
        super(name, square);
        QuantityPeople = PeoplePerSquareMeter(CountryQuantityPeople);
    }

    double PeoplePerSquareMeter(double QuantityPeople) {
        this.QuantityPeople = (QuantityPeople*MILLION)/square;
        return this.QuantityPeople;
    }

    @Override
    public void display() {
        System.out.printf("Name: %s.%nSquare: %d.%nPeople per square meter: %.2f.%n%n",  getName(), getSquare(), getQuantityPeople());
    }

    public double getQuantityPeople() {
        return QuantityPeople;
    }

    public void setQuantityPeople(double quantityPeople) {
        QuantityPeople = quantityPeople;
    }
}
