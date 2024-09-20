public class ReverseArray {
    static void printArray(int []arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    static int[] reverseArray(int[]arr){
        int n=arr.length;
        int []ans=new int[n];
        int j=0;

//        while loop

//        int i=n-1;
//        while(i>=0){
//            ans[j++]=arr[i--];

//            for loop

        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];

        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={2,4,5,6,7,8,9};
        int[] ans=reverseArray(arr);
        printArray(ans);
    }
}
