import java.util.*;

public class photorotation {
    public static void main(String args[]) {
        System.out.println("Enter array size:");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int [][] photo = new int[n][n];
			int [][] rotatedphoto = new int[n][n];
			for (int i = 0; i < n ; i++){
				for (int j = 0;j < n ;j++){
					photo[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n ; i++){
				for (int j = 0;j < n ;j++){
					System.out.print(photo[i][j]);
				}
				System.out.println();
			}

			for (int j = n-1; j >= 0 ; j--){
			for (int i = 0; i < n ; i++){
					rotatedphoto[j][i] = photo[i][j];
				}
			}

			for (int j = n-1; j >= 0 ; j--){
			for (int i = 0; i < n ; i++){
					System.out.print(rotatedphoto[j][i]);
				}
				System.out.println();
			}
		}
		
	    }
    }
