

import java.util.Scanner;

class GreatestCD {

    public static int greatestCommonDivisor(int a , int b){
        
        int GCD = 1;
        if(a==b){
            GCD = a;
        }

        else if(a<b){
            for(int i=1;i<=a;i++){
               if(b%i==0){
                 GCD = i;
               } 
           }
        }

        else{
            for(int i=1;i<=b;i++){
                if(a%i==0){
                    GCD =i;
                }
            }
        }

        return GCD;
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int GCD = greatestCommonDivisor(a, b);
            System.out.println(GCD);
        }
        
    }
    
}
