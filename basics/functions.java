

import java.util.Scanner;

public class functions {

    public static int factorialOfNum(int a){
        int fact = 1;
        for(int i=1;i<=a;i++)
        {
             fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            // int b = sc.nextInt();

            if(a<0){
                System.out.println("Invalid Input");
            }

            else{
            int fact = factorialOfNum(a);
            System.out.println(fact);
            }
        }
    }
    
}
