

import java.util.*;
public class maxcolsum {

    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int max = 0;
        int sum_arr[] = new int[n];
		int grid[][] = new int[n][n];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				grid[i][j] = sc.nextInt();
			}
		}

		for (int j = 0 ; j< n ; j++){
			for (int i = 0 ; i < n ; i++){
				sum += grid[i][j];
			}
            sum_arr[j] = sum;
			System.out.println(sum);
			sum = 0;
		}

		for (int i = 0 ; i <n ;i++){
			System.out.print(sum_arr[i]);
		}

		// int k = 0; int l = 0;
		// while (k<n && l<n){
		// 	sum += grid[k++][l];
		// 	}

		// System.out.println(max);
		
    }
}

