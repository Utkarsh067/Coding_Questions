import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        print(n);
    }

    static void print(int n){
        if(n==1){
            System.out.print(1);
        }

        if(n == 1){
            return;
        }

        System.out.print(n + " ");
        print(n-1);
    }
}
