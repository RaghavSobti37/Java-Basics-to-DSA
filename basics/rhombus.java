
class rhombus {
    public static void main(String[] args) {
        int n =5;
        //int space = n-1;

        // spaces = n-1 -> 0 + n stars + 0-> n-1 spaces
        for (int i=1;i<=n;i++){
            for (int space=n-i-1;space>=0; space--){
                System.out.print(" ");
            }
            for (int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
