
import java.util.*;

public class magicalpark {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int min_e = sc.nextInt();
            int e = sc.nextInt();
            int i = 0;
            int j = 0;

            char grid[][] = new char[m][n];
            
            // Input the grid elements
            for (int k = 0; k < m; k++) {
                for (int l = 0; l < n; l++) {
                    grid[k][l] = sc.next().charAt(0);
                }
            }

            while (e >= min_e && i < m) {
                e--;
                if (j >= n) {
                    i++;
                    j = 0;
                } else if (grid[i][j] == '.') {
                    j++;
                    e -= 2;
                } else if (grid[i][j] == '#') {
                    i++;
                    j = 0;
                    e++;
                } else if (grid[i][j] == '*') {
                    j++;
                    e += 5;
                } else {
                    j++;

                } 
            }

            if (e >= min_e) {
                System.out.println("Yes");
                System.out.println(e);
            } else {
                System.out.println("No");
            }
        }
    }
