import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        for(long i=1;i<=T;i++){
            long n=sc.nextLong();

            if (n == 0) {
                System.out.println(0);
            } else {
                binary(n);
                System.out.println();
            }
        }
    }

    static void binary(long n){
        if(n>0){
            binary(n/2);
            System.out.print(n % 2);
        }
    }
}
