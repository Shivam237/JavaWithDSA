import java.util.Scanner;

public class SuffixSum {
    static int FindArraySum(int[]arr){
        int  totalsum=0;
        for(int i=0; i<arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
            }
    static boolean EqualSumpartition(int []arr){
        int totalsum = FindArraySum(arr);

        int prefSum=0;
        for(int i=0; i<arr.length; i++){
            prefSum +=arr[i];
            int suffixSum = totalsum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
     }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter " +n+" element");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Equal Partiton possible: "+EqualSumpartition(arr));

    }
}
