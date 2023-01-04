public class PhoneNumber<G> implements Number<G> {
    private G Number;

    PhoneNumber(G Number){
        this.Number = Number;
    }

    public G getNumber(){
        return Number;
    }

    public void setNumber(G Number){
        this.Number = Number;
    }
}
