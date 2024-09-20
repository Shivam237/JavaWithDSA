class Arrays{
   public  void demoarrays(){
        int[]ages=new int[3];
        int[]wights=new int[3];
        int[]names=new int [3];
        ages[0]=5;
        ages[1]=8;
        ages[2]=9;
       wights[0]=7;
       wights[1]=9;
       wights[2]=5;
       names[0]=6;
       names[1]=3;
       names[2]=4;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(wights[0]);
        System.out.println(wights[1]);
        System.out.println(wights[2]);

       System.out.println(names[0]);
       System.out.println(names[1]);
       System.out.println(names[2]);

        }


}

public class ArrayExample {
    public static void main(String[] args) {
        Arrays obj = new Arrays();
        obj.demoarrays();


    }
}
