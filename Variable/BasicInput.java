package Variable;
import java.util.*;

public class BasicInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Fixed "System"

        // String input using next()
        String input = sc.next();  // reads one word (until space)
        System.out.println("Input using next(): " + input);

        sc.nextLine(); // to consume leftover newline from previous next()

        // String input using nextLine()
        String name = sc.nextLine();  // reads full line
        System.out.println("Input using nextLine(): " + name);

        // Integer input
        int number = sc.nextInt();
        System.out.println("Integer: " + number);

        // Float input
        float price = sc.nextFloat();
        System.out.println("Float: " + price);
    }
}
