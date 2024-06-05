import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();

        System.out.println(factorial(num));
    }

    static long factorial(long num){
        if(num <= 1){
            return 1;
        }

        return num*factorial(num-1);
    }
}
