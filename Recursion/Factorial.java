package Recursion;
import java.util.Scanner;
public class Factorial {
    static int Findfactorial(int n){
        if(n == 0) return 1;
//        int smallAns = Findfactorial(n-1);
//        int ans = n*smallAns;
//        return ans;
        return n * Findfactorial(n-1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Findfactorial(5));
    }
}
