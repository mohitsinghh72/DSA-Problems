import java.util.Scanner;

// Simple array
public class Simple1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        // Taking input as user wants
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // for printing output as array initially i place open square bracket then the values and in the last closing brackets

        System.out.print("[");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }
}