class traversing {
        void TraversingArray() {
        int[] ages = {12, 35, 45, 54};

//       ( for loop)

        for (int i = 0; i < 4; i++) {
            System.out.println(ages[i]);
        }

//        (for each loop)

        for (int x : ages) {
            System.out.println(x);
        }

//            (while loop)

        int i = 0;
        while (i < 4) {
            System.out.println(ages[i]);
            i++;
        }
    }

    void multipalarray() {
        int[][] age = {{7, 8, 9}, {5, 2, 1}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(age[i][j]);
            }
        }
    }
}


    public class TraversingThrough {
        public static void main(String[] args) {
            traversing obj = new traversing();
            obj.multipalarray();
            obj.TraversingArray();
        }
    }

