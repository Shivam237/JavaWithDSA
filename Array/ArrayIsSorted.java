import java.util.Scanner;

public class ArrayIsSorted {
    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;

            }
        }
        return check;
    }

//    static int lastoccurrence (int[]arr, int x){
//            int lastIndex=-1;
//            for(int i=0; i<arr.length;i++){
//                if(arr[i]==x){
//                    lastIndex=i;
//                }
//            }
//            return lastIndex;
//
//        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of Array: ");
            int n = sc.nextInt();
            int[]arr=new int[n];
            System.out.println("Enter " + n + " Element");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();


            }
//            System.out.println("Enter x");
//            int x=sc.nextInt();
//            System.out.println("Last Occurrence of x "+lastoccurrence(arr,x));
            System.out.println("Is sorted " +isSorted(arr));
        }
    }



