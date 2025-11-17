import java.util.Arrays;
import java.util.Scanner;


public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();                     // Taking input for 2D array as in rows
        int col = sc.nextInt();                     // Taking input as columns

        int[][] arr = new int[row][col];

        for(int i = 0;i<arr.length;i++){                // This for loop takes inputs
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        for(int i = 0;i<arr.length;i++){                // This for loops is used to give output
//            for(int j = 0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // This is Enhanced for loop for output

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

// ----------------------------------------------------------------------------------------------------------------- //

//public class TwoDimensionalArray{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = {                    // This type of matrix is called jagged Array where each row have different columns
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
//
//        // To print this type of matrix
//
//        for(int[] a : arr){                                 // 1st way by Enhanced for loop
//            System.out.println(Arrays.toString(a));
//        }
//
//        for(int i = 0;i<arr.length;i++){                    // 2nd way
//            for(int j = 0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}