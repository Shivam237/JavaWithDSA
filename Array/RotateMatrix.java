import java.util.Scanner;

public class RotateMatrix {
    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeInPlace(int[][]matrix,int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void ReverseArray(int[]arr){
        int i=0, j=arr.length-1;
        while (i < j){
            int temp= arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void Rotate(int[][]matrix, int n) {
        transposeInPlace(matrix,n,n);

        for(int i=0; i<n; i++){
            ReverseArray(matrix[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row and columns of Matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int [r][c];
        int totalElement= r * c;
        System.out.println("Enter " +totalElement+" values");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

      Rotate(matrix,r);

        System.out.println("Rotation of Matrix ");
        printMatrix(matrix);
    }
}

