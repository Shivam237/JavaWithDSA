package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n) {
//        base case
        if (n == 0 || n == 1) {
            return n;
        }
//       sub problem
//         int prev = fibonacci(n-1);
//        int prevprev=fibonacci(n-2);
//        self work
//        return prev + prevprev;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        for(int i=0; i<=10; i++) {

            System.out.println(fibonacci(i));
        }
    }

}
