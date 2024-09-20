public class logicaloperators {
    public static void main(String[] args) {
        int a=15,b=10,c=5;
//        && operators

        System.out.println((a>b)&&(b>c));
        System.out.println((a>b)&&(b<c));

//        || operators
        System.out.println((c<b)||(a<b));
        System.out.println((a>b)||(b>c));
        System.out.println((a<b)||(b>c));

//        ! operators
        System.out.println(!(a==b));
        System.out.println(!(a>b));

    }
}
