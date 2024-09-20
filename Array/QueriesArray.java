import java.util.Scanner;

public class QueriesArray {
    static int[] MakefrequencyArray(int []arr){
        int[]freq=new int[100005];
        for(int i=0;i<arr.length; i++){
            freq [arr[i]]++;

        }
        return freq;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq=MakefrequencyArray(arr);
        System.out.println("Enter the number of Queries");
        int q=sc.nextInt();

        while(q>0){
            System.out.print("Enter Number to be Searched ");
            int x= sc.nextInt();;
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }

            q-- ;
        }

    }
}
