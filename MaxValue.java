import java.util.Arrays;
import java.util.Scanner;

// Program for Finding the max values in the array

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {32, 12, 45, 3, 54, 44};
        Max(arr);
    }
    static void Max(int[] arr){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
