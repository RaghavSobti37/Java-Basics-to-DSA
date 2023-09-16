
import java.util.*;

class count {
    public static void countOfNum(int num) {
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;

        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                countZero++;
            } else if (n > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        System.out.println("Number of Negative Numbers: " + countNegative);
        System.out.println("Number of Zeros: " + countZero);
        System.out.println("Number of Positive Numbers: " + countPositive);

        sc.close(); // Close scanner in function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of numbers to input: ");
        int num = sc.nextInt();

        countOfNum(num);
        sc.close(); // Close the Scanner in the main method
    }
}
