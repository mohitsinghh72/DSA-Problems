import java.util.Arrays;
import java.util.Scanner;

// Program for Reverse the values in the array

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = Reverse(arr);
        System.out.println(Arrays.toString(ans));


    }
    static int[] Reverse(int[] arr){
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}