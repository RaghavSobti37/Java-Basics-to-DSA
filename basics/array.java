import java.util.Scanner;

class array {
    public static void main(String[] args) {
        int[] marks = new int[3]; 
        marks[0] = 96;
        marks[1] = 78;
        marks[2] = 95;
        
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int numbers[] = new int[num];

            for(int i=0 ; i<num;i++){
                numbers[i] = sc.nextInt();
            }

            int search = sc.nextInt();

            for(int i=0; i<num;i++){
                if(numbers[i] == search){
                    System.out.print(i);
                }
            }
            
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int doubleArray[][] = new int[rows][columns];
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    doubleArray[i][j]=sc.nextInt();
                }
            }
        }
    }
    
}
