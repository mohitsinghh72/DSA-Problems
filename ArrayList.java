import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList {                                         //1D Array
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i< 5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        for(int i = 0;i<5 ;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}

// ----------------------------------------------------------------------------------------------------------------- //

//public class ArrayList{                                              //2D Array using ArrayList
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//
//        for(int i = 0;i<3;i++){
//            list.add(new ArrayList<>());
//        }
//
//        for(int i = 0;i<3;i++){
//            for(int j = 0; j<3;j++){
//                list.get(i).add(sc.nextInt());
//            }
//        }
//
//        System.out.println(list);
//    }
//}
