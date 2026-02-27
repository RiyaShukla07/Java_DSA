package Variable;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eracer = sc.nextFloat();
        float total = pencil+pen+eracer;
        System.out.println("Bill is: " +total);
        float newTatal = total + (0.18f * total);  //gst alag nikala tha
        System.out.println("Bill with 18% tax: " +newTatal);
    }
}
