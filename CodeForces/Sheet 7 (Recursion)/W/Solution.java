import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            long N = sc.nextLong();
            boolean canReach = canReachNumber(N, 1);
            System.out.println(canReach ? "YES" : "NO");
        }
    }

    static boolean canReachNumber(long N, long current) {
        if (N == current) {
            return true;
        } else if (N < current || current > Math.pow(10, 12)) { 
            return false;
        }

        return canReachNumber(N, current * 10) || canReachNumber(N, current * 20);
    }
}
