public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 124;
    }

    public String getDescription(){
        return String.valueOf(super.getDescription() +" Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.\n");
    }
}
