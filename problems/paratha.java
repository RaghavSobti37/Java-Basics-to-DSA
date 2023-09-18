
import java.util.*;
public class paratha {
    public static void main(String args[]) {
		// Cook of rank R can cook 1 paratha in R , next in 2R and so on
		Scanner sc= new Scanner(System.in);
		int p = sc.nextInt();
		int c = sc.nextInt();
		int rank[] = new int[c];
		for (int i = 0 ; i <c ; i++){
			rank[i] = sc.nextInt();
		}

		for (int i = 0 ; i <c ; i++){
			int time = 0;
			for( int j = 0 ; j < c ; j++){
			
			time += (rank[i]*(j+1));
			System.out.print(time + " ");
			}
            System.out.println();
		}
		
		}
   }