package Recursion1;

public class power {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn; 
        return x * pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
