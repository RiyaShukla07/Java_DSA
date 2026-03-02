import java.util.*;
public class print1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter =1;
        while (counter <= range){
            System.out.print(counter + " ");//for same line
            counter++;
        }
        System.out.println();
    }
}
