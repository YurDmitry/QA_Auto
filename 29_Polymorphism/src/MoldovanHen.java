public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 24;
    }

    public String getDescription(){
        return String.valueOf(super.getDescription() +" Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.\n");
    }
}
