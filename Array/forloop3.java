import java.util.Scanner;

public class forloop3 {
    public static void main(String[] args) {
//        print the sum of the stream of integer in the input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        do{
            sum+=num;
         num=sc.nextInt();
        }while(num!=-1);
//        while (num != -1) {
//            sum += num;
//            num = sc.nextInt();
//
//        }
        System.out.println(sum);
    }
}
