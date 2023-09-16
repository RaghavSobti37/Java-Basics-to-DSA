

import java.util.*;

class Fibonacci{
    public static void fibonacciSeries(int n){
        //fibonacci series
               int a=0,b =1;
               for (int i=1 ;i<=n;++i) {
                       System.out.print(" "+a);
                            b=b+a;   //sum of previous two numbers
                            a=b-a;  //previous number is now next one and sum becomes new previous value
                        }
                   }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements to show in fibonacci series : ");
            int n = sc.nextInt();

            fibonacciSeries(n);
        }
        
    }
}