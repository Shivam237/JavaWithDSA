import java.util.Scanner;
public class ReferenceArray {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;
        System.out.println("original arr");
        printArray(arr);
        int[]arr_2=arr;
        System.out.println("copid arr_2");
        printArray(arr_2);

        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("original array afer changing arr_2");
        printArray(arr);

        System.out.println("copid arr_2 after changing arr_2");
        printArray(arr_2);

    }
}
