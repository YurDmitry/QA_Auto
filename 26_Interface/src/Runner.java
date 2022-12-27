public class Runner {

    public static void main(String[] args){
        Printable phone = new Phone("IOS","WHITE");
        phone.print();

        Printable laptop = new Laptop("MAC","GREY");
        laptop.print();
    }
}
