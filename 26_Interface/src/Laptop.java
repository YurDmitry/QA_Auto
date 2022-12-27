public class Laptop implements Printable{
    private String model;
    private String color;

    public Laptop(String model, String color){
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void print(){
        System.out.printf("It's laptop.%nModel: %S.%nColor: %s.%n%n", getModel(), getColor());
    }
}
