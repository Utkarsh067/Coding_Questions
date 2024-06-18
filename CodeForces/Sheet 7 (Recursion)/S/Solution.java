import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        double average = calculateAverage(arr);
        System.out.printf("%.6f", average);
    }

    static double calculateAverage(long[] arr) {
        long sum = 0;

        for (long element : arr) {
            sum += element;
        }

        return (double) sum / arr.length;
    }
}
