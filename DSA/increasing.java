package DSA;
import java.util.*;
public class increasing {
    
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            printNumbers(n);
        }
    }

    
}