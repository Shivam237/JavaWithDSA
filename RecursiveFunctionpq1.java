package Recursion;

public class RecursiveFunctionpq1 {
    static int pow(int p ,int q) {
        if (q == 0) return 1;

        int smallpow = pow(p, q / 2);
        if (q % 2 == 0) {
            return smallpow * smallpow ;
        }else{
            return p * smallpow * smallpow ;
        }
////            even code
//            int smallpow = pow(p,q/2);
//            return smallpow * smallpow;
//        }
////        odd code
//        int smallpow = pow(p ,q/2);
//        return p* smallpow * smallpow;
    }
    public static void main(String[] args) {
        System.out.println(pow(2 , 5));

    }
}
