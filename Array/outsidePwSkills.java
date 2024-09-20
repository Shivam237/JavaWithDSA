import pw.skills.app;

public class outsidePwSkills {
    public static void main(String[] args) {
    app obj =new app();
        System.out.println("outside package Non-child class" +obj.str_1);
        app3 obj3 =new app3();
        obj3.printfromchildclass();

    }
}
class app3 extends app{
    void printfromchildclass(){
        app3 obj3 =new app3();
        System.out.println("child class"+obj3.str_1);
    }
}
//yeh code our pw,skill package dono milkar vana hai
