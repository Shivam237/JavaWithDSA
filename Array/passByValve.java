public class passByValve {
    static void changevalue(int a){
        a*=100;
        System.out.println("inside changing value"+a);
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println("befor changing value"+a);
        changevalue(a);
        System.out.println("After changing value "+a);
    }
}
