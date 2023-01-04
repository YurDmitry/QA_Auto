public class Runner {
    public static void main(String[] args){
        PhoneNumber<String> number1 = new PhoneNumber<String>("+375(33) 333-33-33");
        PhoneNumber<Long> number2 = new PhoneNumber<Long>(375333333333L);

        String numberStr = number1.getNumber();
        Long numberLong = number2.getNumber();

        System.out.println(numberStr + " - Это номер типа строки.");
        System.out.println(numberLong + " - Это номер типа лонг.");
    }
}
