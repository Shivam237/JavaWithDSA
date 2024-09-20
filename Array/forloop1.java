import java.util.Scanner;

public class forloop1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//        for(int num=n;num>=1;num--){
        for(int num=n;num>=1;num-=2){
            System.out.println(num);
        }
    }
}
