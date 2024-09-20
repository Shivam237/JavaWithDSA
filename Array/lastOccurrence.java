import java.util.Scanner;
public class lastOccurrence {
    static int lastoccurrence (int[]arr, int x){
        int lastIndex=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();


        }
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Last Occurrence of x "+lastoccurrence(arr,x));
    }
}

