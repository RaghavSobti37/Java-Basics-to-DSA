import java.util.*;

public class boolmatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int row[] = new int[m];
        int col[] = new int[n];

        // Input the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Modify the matrix based on row and col arrays
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 1;
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
