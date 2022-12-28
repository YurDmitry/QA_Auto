public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 43;
    }

    public String getDescription(){
        return String.valueOf(super.getDescription() +" Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.\n");
    }
}
