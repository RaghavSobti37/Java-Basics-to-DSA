import java.util.Scanner;

public class kroot {
    public static long findMaxX(int k, long n) {
        long low = 1;
        long high = n;
        long result = -1; // Initialize result to -1, which will be used if no valid x is found

        while (low <= high) {
            long mid = (low + high) / 2;
            long pow = (long) Math.pow(mid, k);

            if (pow <= n) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.close();

        for (int i = 1; i <= t; i++) {
			long n = sc.nextLong();
            int k = sc.nextInt();
            long maxX = findMaxX(k, n);
            System.out.println(maxX);
        }
    }
}
