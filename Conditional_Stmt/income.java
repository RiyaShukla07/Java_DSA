package Conditional_Stmt;
import java.util.Scanner;
public class income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax=0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int)(income *0.20);
        }
        else{
            tax = (int)(income *0.30);
        }
        System.out.println("your tax is:"  +tax);
    }
    
}
