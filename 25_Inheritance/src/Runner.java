public class Runner {
    public static void main(String[] args){
        Country Belarus = new Country("Belarus", 207600, 8.32);
        Belarus.display();

        Country Belarus1 = new Country();
        Country Belarus2 = new Country("Belarus");
        Country Belarus3 = new Country("Belarus", 207600);
        Belarus1.display();
        Belarus2.display();
        Belarus3.display();
        }
}
