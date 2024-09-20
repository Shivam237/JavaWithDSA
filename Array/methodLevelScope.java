class methodlevel{
    int add(){
        int a=15;
        int b=20;
        return a+b;
    }
    int sub(){
        int p=40;
        int q=50;
        return p-q;
    }
}
public class methodLevelScope {
    public static void main(String[] args) {
        methodlevel obj= new methodlevel();
        System.out.println(obj.add());
        System.out.println(obj.sub());
    }
}
