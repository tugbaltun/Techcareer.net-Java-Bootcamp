import java.util.Scanner;

public class Question1Addition {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int m, n, i, j;
        System.out.print("Enter the number of rows of the matrices=");
        m = input.nextInt();
        System.out.print("Enter the number of columns of the matrices=");
        n = input.nextInt();
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int C[][] = new int[m][n];

        System.out.println("Enter the matrix A:");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                System.out.printf("A[%d][%d]=", i + 1, j + 1);
                A[i][j] = input.nextInt();
            }

        System.out.println("Enter the matrix B:");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                System.out.printf("B[%d][%d]=", i + 1, j + 1);
                B[i][j] = input.nextInt();
            }

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        System.out.printf("A+B=\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.printf("%d ", C[i][j]);
            System.out.printf("\n");
        }
        input.close();

    }
}
