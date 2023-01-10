public class DoubleNumber extends Number{
    private double number;
    public DoubleNumber(double number){
        this.number = number;
    }

    @Override
    void toDisplay() {
        System.out.println("Это дробное число: " + getNumber());
    }

    private double getNumber(){
        return number;
    }
}
