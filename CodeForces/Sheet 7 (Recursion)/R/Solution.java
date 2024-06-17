import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalindrome(arr, 0, n - 1) ? "YES" : "NO");
    }

    static boolean isPalindrome(int[] arr, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (arr[start] != arr[end]) {
            return false;
        }

        return isPalindrome(arr, start + 1, end - 1);
    }
}
