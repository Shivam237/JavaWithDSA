import java.util.Scanner;

public class RangQuery {
    static int[]makePrifexSumarray(int[]arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n= sc.nextInt();
        int []arr=new int[n+1];

        System.out.println("Enter "+n+" Element");
        for(int i=1; i<=n; i++){
            arr[i]= sc.nextInt();

        }
        int[] prefsum=makePrifexSumarray(arr);
        System.out.println("Enter Number of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter Range");
            int l= sc.nextInt();
            int r=sc.nextInt();

            int ans=prefsum[r]-prefsum[l-1];
            System.out.println("sum: "+ans);

        }

    }
}
