import org.w3c.dom.ls.LSOutput;

class maximum{
    void maxarray(){
        int []max ={1,2,5,6,8,9};
        int ans=0;
        for (int i=0;i< max.length;i++){
            if(max[i] > ans);
            ans=max[i];
        }
        System.out.println("maximum no:-"+ ans);
    }

}
public class maximumArray {
    public static void main(String[] args) {
        maximum obj =new maximum();
        obj.maxarray();
    }
}
