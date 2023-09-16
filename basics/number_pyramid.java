
class number_pyramid {
    public static void main(String[] args) {
        int m=5; //rows
        for (int i=1;i<=m;i++){
            for(int spaces=1;spaces<=m-i;spaces++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
