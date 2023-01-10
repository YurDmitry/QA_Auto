public class IntNumber extends Number{
    private int number;
    public IntNumber(){
    }
    public IntNumber(int number){
        this.number = number;
    }

    @Override
    void toDisplay() {
        System.out.println("Это целове число: " + getNumber());
    }

    private int getNumber(){
        return number;
    }
}
