package Arrays;
import java.util.*;
public class reverse {
    public static void reverse(int numbers[]){
      int first = 0, last = numbers.length-1;

      while(first < last){
        //swap
        int temp = numbers[last];  //temp=last
        numbers[last] = numbers[first];  //last = first
        numbers[first] = temp; //first=temp

        first++;
        last--;
      }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
