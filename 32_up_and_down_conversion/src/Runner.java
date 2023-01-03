public class Runner {
    public static void main(String[] args)
    {
        // Восходящее преобразование
        Car car = new Vodila("BMW", "Ярик");
        Object obj = car;

        // Нисходящее преобразование
        Car newCar = (Car) obj;
        Vodila newVodila = (Vodila) obj;

        System.out.println(newCar.getModelName());
        System.out.println(newVodila.getPersonName());
        System.out.println(newVodila.getModelName());
    }
}


