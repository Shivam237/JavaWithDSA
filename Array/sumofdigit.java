import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sumofDigit = 0;
        int original_n= n;
        while(n>0){
            sumofDigit += n%10;
            n= n/10;

        }
        System.out.println("Sum of digit" +original_n+"=" +sumofDigit);
    }
}

