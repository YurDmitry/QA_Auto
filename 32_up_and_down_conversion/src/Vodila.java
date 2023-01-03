public class Vodila extends Car{
    private final String PersonName;

    public Vodila(String ModelName, String PersonName){
        super(ModelName);
        this.PersonName = PersonName;
    }

    public String getPersonName(){
        return PersonName;
    }
}
