import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        print(n); //n == numbers of time we want to print a string.
    }

    static void print(int n){
        if(n==0){
            return;
        }

        System.out.println("I love Recursion");
        print(n-1);
    }
}
