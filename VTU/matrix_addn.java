import java.util.Scanner;

public class matrix_addn {
    public static void main(String args[]) {
        if(args.length != 2) {
            System.out.println("Use java matrix_addn <rows> <cols>");
        }
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);

        int matrix1[][] = new int[N][M];
        int matrix2[][] = new int[N][M];
        int result[][] = new int[N][M];

        Scanner matIn = new Scanner(System.in);

        System.out.println("Enter the elements of matrix 1 :");
        inputMatrix(matIn, matrix1);
        System.out.println("Enter the elements of matrix 2 :");
        inputMatrix(matIn, matrix2);

        System.out.println("Matrix 1:");
        display(matrix1);
        System.out.println("Matrix 2:");
        display(matrix2);

        addMatrix(matrix1, matrix2, result);
        System.out.println("Matrix after addition: ");
        display(result);

        matIn.close();
    }
    public static void inputMatrix(Scanner matIn, int matrix[][]) {
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.println("Enter the element at (" + i + ", " + j +")");
                matrix[i][j] = matIn.nextInt();
            }
        }
    }

    public static void addMatrix(int matrix1[][], int matrix2[][], int result[][]) {
        for(int i = 0; i< matrix1.length; i++) {
            for(int j = 0; j<matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public static void display(int matrix[][]) {
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}