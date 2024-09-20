import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int numofDigit = 0;
        int original_n= n;
        while(n>0){
            n=n/10;
            numofDigit++;

        }
        System.out.println("Number of digit" +original_n+"=" +numofDigit);
    }
}
