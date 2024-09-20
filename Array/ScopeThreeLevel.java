import org.w3c.dom.ls.LSOutput;

class ClassLevelScope{
    int a=10;
    int b=15;

    int add(){

        return a+b;
    }
    int sub() {
        return a - b;
    }

}

public class ScopeThreeLevel {
    public static void main(String[] args) {
        ClassLevelScope obj =new ClassLevelScope();
        System.out.println(obj.add());
        System.out.println(obj.sub());

    }
}
