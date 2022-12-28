public class CountryOptions {
    protected String name;
    protected int square;

    protected CountryOptions(String name, int square){
        this.name = name;
        this.square = square;
    }

    protected void display(){
        System.out.println("Name: " + getName() + ". Square: " + getSquare());
    }

    protected String getName(){
        return name;
    }

    protected int getSquare(){
        return square;
    }
}
