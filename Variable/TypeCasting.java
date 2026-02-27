package Variable;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        float marks = 99.999f;
        int intMarks = (int) marks;  // cast to int, store in a different variable
        System.out.println(intMarks);

        char ch ='a';
        int number = ch;
        System.out.println(number);
    }
}
