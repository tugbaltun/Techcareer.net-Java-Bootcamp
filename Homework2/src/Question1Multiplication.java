import java.util.Scanner;

public class Question1Multiplication {
    private static int m, n, f, p, i, j, k;
    private static Scanner input = new Scanner(System.in);
    private static void multiplicationOfMatrices(int A[][], int B[][], int C[][]){
        if (n != f)
            System.out.println("Matrices cannot be multiplied");
        else {
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++) {
                    System.out.printf("A[%d][%d]=", i + 1, j + 1);
                    A[i][j] = input.nextInt();
                }
            System.out.printf("\n");
            for (i = 0; i < f; i++)
                for (j = 0; j < p; j++) {
                    System.out.printf("B[%d][%d]=", i + 1, j + 1);
                    B[i][j] = input.nextInt();
                }
            for (i = 0; i < m; i++)
                for (j = 0; j < p; j++)
                    for (k = 0; k < n; k++)
                        C[i][j] += A[i][k] * B[k][j];
            System.out.printf("\nA*B=\n");
            for (i = 0; i < m; i++) {
                for (j = 0; j < p; j++)
                    System.out.printf("%d\t", C[i][j]);
                System.out.printf("\n");
            }
        }

    }
    public static void main(String[] args) {


        System.out.println("Enter the dimensions of the matrix A:");
        m = input.nextInt();
        n = input.nextInt();
        System.out.println("Enter the dimensions of the matrix B:");
        f = input.nextInt();
        p = input.nextInt();
        int A[][] = new int[m][n];
        int B[][] = new int[f][p];
        int C[][] = new int[m][p];

        multiplicationOfMatrices(A, B, C);
        input.close();
    }

}
