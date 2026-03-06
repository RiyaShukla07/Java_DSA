package Recursion1;

public class last {
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String arg[]){
        int arr[] = {5,6, 7, 5 ,9 ,3, 6, 9, 7};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
