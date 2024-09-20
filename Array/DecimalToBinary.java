import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal_num=sc.nextInt();
        int ans=0;
        int pw=1;
        while(Decimal_num > 0 ){
            int parity= Decimal_num %2;
            ans+= (parity *pw);
            pw*=10;
            Decimal_num/=2;
        }
        System.out.println(ans);
    }
}
