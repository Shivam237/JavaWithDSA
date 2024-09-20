package Recursion;

public class SomOfDigit {
    static int somOfDigit(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
//        2
//        int smallAns = somOfDigit(n/10);
//        return  sma llAns + (n%10);

//        1
//        int ans = smallAns +  (n%10);
//        return ans;

        return somOfDigit(n/10) + (n%10);
    }
    public static void main(String[] args) {

        System.out.println( somOfDigit(12345));
    }
}
