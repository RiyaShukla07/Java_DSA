package Conditional_Stmt;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }
    
}
