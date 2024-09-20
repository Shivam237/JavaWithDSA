import java.util.Scanner;
public class Occurrences {
    static int CountOccurrnces(int[] arr, int x) {
        int Count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                Count++;
            }
        }
        return Count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array; ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n + "element; ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Count of X"+CountOccurrnces(arr,x));
    }
}
