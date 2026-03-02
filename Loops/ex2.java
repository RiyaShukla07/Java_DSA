import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsumm = 0;
        do{System.out.println("Enter the number");
           number = sc.nextInt();
           if(number % 2 ==0){
            evensum+= number;
           }else{
            oddsumm+= number;
           }
            
            System.out.println("Enter 1 for choice yes and 0 for choice no" );
            choice = sc.nextInt();


        }while(choice == 1 ) ;
        {
            System.out.println("sum of even number:" + evensum);
            System.out.println("sum of odd number:" + oddsumm);
        }
    }

}
