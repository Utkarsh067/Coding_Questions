import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        long count = 1;
        long sum=0;

        suffix(arr, count, m,sum);
    }

    static void suffix(int[] arr, long count, int m,long sum){
        

        if(count > m){
            System.out.println(sum);
            return;
        }

        sum += arr[(int) (arr.length-count)];
        suffix(arr, count+1, m,sum);
    }
}
