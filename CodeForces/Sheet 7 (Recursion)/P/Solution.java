import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(log(n));
    }

    static int log(long n){
        
        if(n == 1 || n == 0){
            return 0;
        } else{
            return 1 + log(n/2);
        }
    }
}
