class block{
    void BlockLevel(){
        int b=5;
        System.out.println(b);

        {
            int a=10;
            System.out.println(a);
        }
        {
            int a=100;
            System.out.println(a);
        }
        for(int i=0; i<5; i++)
            System.out.println(i);
    }

}


public class blockLevelScope {
    public static void main(String[] args) {
        block obj =new block();
        obj.BlockLevel();
    }
}
