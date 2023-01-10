import java.util.ArrayList;
import java.util.Collection;

public class WildcardsRunner {
    public static void main(String[] args){
        Collection<ElementOfString> list1 = new ArrayList<>();
        list1.add(new ElementOfString());
        list1.add(new ElementOfString());

        Collection<Number> list2 = new ArrayList<>();
        list2.add(new Number());
        list2.add(new Number());

        Collection<IntNumber> list3 = new ArrayList<>();
        list3.add(new IntNumber(13));
        list3.add(new IntNumber(17));

        Collection<LongIntNumber> list4 = new ArrayList<>();
        list4.add(new LongIntNumber(21342134211L));
        list4.add(new LongIntNumber(3434354354L));

        Collection<DoubleNumber> list5 = new ArrayList<>();
        list5.add(new DoubleNumber(231.4));
        list5.add(new DoubleNumber(534.1433));

        System.out.println("Использование конструкции 1.");
        iterateNumber1(list1);
        iterateNumber1(list2);
        iterateNumber1(list3);
        iterateNumber1(list4);
        iterateNumber1(list5);


        System.out.println("\nИспользование конструкции 2.");
        iterateNumber2(list1);
        iterateNumber2(list2);
        iterateNumber2(list3);
        iterateNumber2(list4);
    }

    // Использование конструкции <? extends ...> позволяет не указывать точное назание
    // класс или его наследника
    public static void iterateNumber1(Collection<? extends ElementOfString> list){
        System.out.println();
        for (ElementOfString e:list){
            e.toDisplay();
        }
    }

    // Использование конструкции <? super ...> указывает на сам класс и его предков
    public static void iterateNumber2(Collection<? super LongIntNumber> list){
        System.out.println();
        Collection<? extends ElementOfString> newlist = (Collection<? extends ElementOfString>) list;
        for (ElementOfString e:newlist){
            e.toDisplay();
        }
    }
}