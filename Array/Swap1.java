public class Swap1 {
    static void swapWithoutTemp(int a,int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Original values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        int []arr={2,4,5,6,7,8};
        swapWithoutTemp(a,b);
    }
}
