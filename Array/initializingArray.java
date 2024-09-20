class initializing {
    void multidimensional() {
        int[][] multiarray = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        System.out.println(multiarray[0][0]);
        System.out.println(multiarray[0][1]);
        System.out.println(multiarray[0][2]);

        System.out.println(multiarray[1][0]);
        System.out.println(multiarray[1][1]);
        System.out.println(multiarray[1][2]);

        System.out.println(multiarray[2][0]);
        System.out.println(multiarray[2][1]);
        System.out.println(multiarray[2][2]);
    }

    void singleDimensional() {
        String[] names = {"shivam", "bikash", "sanjeet"};
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
}


        public class initializingArray {
            public static void main(String[] args) {
                initializing obj = new initializing();
                obj.singleDimensional();
//        obj.multidimensional();

            }
        }
