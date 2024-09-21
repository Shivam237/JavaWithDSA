package Recursion;

public class RecursiveFunctionpq {
    static int power(int p, int q){
        if(q == 0)return 1;
        int smallAns = power(p,q-1);
        return smallAns*p;
//        return power(p,q-1)*p;
    }
    public static void main(String[] args) {
        System.out.println(power(5,4));

    }
}
