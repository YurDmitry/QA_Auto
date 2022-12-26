import java.util.Formatter;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Строка c форматированием: %.2f.%n", 1000.0 / 3.0);
        System.out.format("%s, в следующем году тебе будет %d!\n", "Оля", 18);
        System.out.printf("Hello %1$s!%n%1$s, how are you?%n"
                        + "Welcome to the site %2$s.",
                "Olia Karpuk", "www.senlainc.com");
    }
}