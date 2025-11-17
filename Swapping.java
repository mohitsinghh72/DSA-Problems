import java.util.Arrays;
import java.util.Scanner;

// Program for swapping the values in the array

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,24,27,43,6,77,100};

        Swap(arr,4,0);

        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}