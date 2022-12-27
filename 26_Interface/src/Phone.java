public class Phone implements Printable{
    private String model;
    private String color;

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public void print(){
        System.out.printf("It's phone.%nModel: %s.%nColor: %s.%n%n", getModel(), getColor());
    }
}
