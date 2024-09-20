import java.util.Scanner;

public class conditionaloperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        if(value % 2 == 0 && value %  3==0){
            System.out.println(value);
        }

    }
}
