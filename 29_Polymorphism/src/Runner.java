public class Runner {
    public static void main(String[] args)
    {
        Hen hen1 = HenFactory.getHen(Country.BELARUS);
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        Hen hen4 = HenFactory.getHen(Country.MOLDOVA);

        System.out.print(hen1.getDescription());
        System.out.print(hen2.getDescription());
        System.out.print(hen3.getDescription());
        System.out.print(hen4.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            }
            if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            }
            if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            }
            if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            }
            return hen;
        }
    }
}
