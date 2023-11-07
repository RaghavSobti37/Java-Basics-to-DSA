package DSA;
import java.util.Scanner;
class sum{
    public static int sumOfNum(int n){
        if (n > 0 ){
            return n + sumOfNum(n-1);
        }
       else {
            return 0;
       } 
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number : ");
            int n = sc.nextInt();
            System.out.println(sumOfNum(n));
        }
    }
}