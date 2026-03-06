package Recursion1;

public class first {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String arg[]){
        int arr[] = {5,6, 7 ,9 ,3, 6};
        System.out.println(firstOccurence(arr, 9, 0));
    }
}
