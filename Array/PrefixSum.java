import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class PrefixSum {
    static void PrintArrat(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] MakePrifixSumArray(int[]arr){
        int n=arr.length;
//        int[] pref = new int [n];
//        pref[0]=arr[0];
//        for(int i=1; i < n; i++){
//            pref[i]=pref[i-1]+arr[i];
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];


        }
        return arr;
//        return pref;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size" );
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter "+n+" Element");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Input Array");
        PrintArrat(arr);
        int []pref=MakePrifixSumArray(arr);
        PrintArrat(pref);
    }

}
