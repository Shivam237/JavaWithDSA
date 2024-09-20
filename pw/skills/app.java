package pw.skills;

public class app {
    public String str_1 =" i am  public member";

    void printFromclass(){
        System.out.println("Within class " +str_1);
    }
    public static void main(String[] args) {
        app obj = new app();
        obj.printFromclass();
        System.out.println("within class" +obj.str_1);
        app2 obj2 =new app2();
        obj2.printFromOutSideClass();









    }
}
class app2 {
    void printFromOutSideClass(){
        app obj = new  app();
        System.out.println("within in package outside class" +obj.str_1);
    }

}
