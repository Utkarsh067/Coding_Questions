import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr= new long[n];

        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        maxNumber(arr, 0, Long.MIN_VALUE);
    }

    static void maxNumber(long[] arr, long index,long max){
        if(index == arr.length){
            System.out.println(max);
            return;
        }

        if(arr[(int) index] > max){
            max = arr[(int) index];
        }

        maxNumber(arr, index+1, max);
    }
}
