
public class patterns {
    public static void main(String[] args) {
        // Hollow Rectangle
        // int m = 4;
        // int n = 5;
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || j==1 || i==m || j ==n){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Half Pyramid
        // Easier way is to have the inner loop have the limit till the row number
        // for (int j=1;j<=(i);j++)
        // int m = 4; //rows
        // int n = 4; //columns
        // for (int i=1;i<=m;i++)
        // {
        //     for(int j=1;j<=n;j++){
        //         //print star equal to the number of row
        //         if(i>=j){
        //          System.out.print("*"); 
        //         } 
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid
        // int n = 4;
        // for(int i=n;i>=0;i--){
        //     for (int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 0-1 triangle
        int n =5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

