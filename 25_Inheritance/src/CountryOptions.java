public class CountryOptions {
    protected String name;
    protected int square;

    public CountryOptions(String name, int square){
        this.name = name;
        this.square = square;
    }

    public void display(){
        System.out.println("Name: " + name + ". Square: " + square);
    }

    public String getName(){
        return name;
    }

    public int getSquare(){
        return square;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSquare(int square){
        this.square = square;
    }
}
