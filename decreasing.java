import java.util.*;
class decreasing{
    public static int print(int n){
        if (n==0){
            return 0;
        } else {
            System.out.print(n + " ");
            return print(n-1);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            System.out.println(print(n) + " ");
        }
    }
}