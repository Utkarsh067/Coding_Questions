import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();

        System.out.println(factorial(num));
    }

    static int factorial(long num){
        if(num < 3){
            return (int) num-1;
        }

        return factorial(num-1) + factorial(num-2);
    }
}
