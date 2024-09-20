import java.util.Scanner;
public class SecondLargest {
    static int findmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int []arr){
        int max=findmax(arr);
        for(int i=0; i<arr.length;  i++) {
        if(arr[i]==max){
            arr[i]=Integer.MIN_VALUE;

        }
        }
        int secondmax=findmax(arr);
        return secondmax;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
//        System.out.println("Frist Maximum Element " +findmax(arr));
        System.out.println("Second Maximum Element " +findSecondMax(arr));
    }
}

