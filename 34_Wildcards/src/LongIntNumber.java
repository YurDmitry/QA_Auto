public class LongIntNumber extends IntNumber{
    private long number;
    public LongIntNumber(long number){
        this.number = number;
    }

    @Override
    void toDisplay() {
        System.out.println("Это большое целове число: " + getNumber());
    }

    private long getNumber(){
        return number;
    }
}
