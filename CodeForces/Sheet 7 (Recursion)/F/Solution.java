import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(n, arr);
    }

    static void print(int n, int[] arr){
        if(n == 0){
            return;
        }

        if(n % 2 != 0){
            System.out.print(arr[n-1]+" ");
        }
        print(n-1, arr);
    }
}
