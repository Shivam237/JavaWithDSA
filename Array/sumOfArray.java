class arra{
    void calculate(){
        int [] arr={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}


public class sumOfArray {
    public static void main(String[] args) {
        arra obj=new arra();
        obj.calculate();
    }
}
