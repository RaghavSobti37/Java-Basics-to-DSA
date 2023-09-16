
import java.util.*;
class Loops {
    public static void main(String[] args) {
        // for (int i = 0; i <=10 ;i++) { //for loop with initialization, condition and incrementation
        //     System.out.print(i+" ");
        // }
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
        //     int sum = 0;
        // for(int i = 0;i < n; i++){
        //     sum = sum +i;
        // }
        // System.out.println(sum);
            for(int i=1;i<=10;i++)
            {
                System.out.println(n*i);
            }

    }
}
}


