public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 12;
    }

    public String getDescription(){
        return String.valueOf(super.getDescription() +" Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.\n");
    }
}
