class search {
    void searchElement() {
        int[] arr = {1, 5, 3, 4, 6, 3, 8};
        int x = 3;

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }

        }
        System.out.println("found " + x + " at index " + ans);
    }
}

public class searchElementArray {
    public static void main(String[] args) {
        search obj=new search();
        obj.searchElement();
    }
}
