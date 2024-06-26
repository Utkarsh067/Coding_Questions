import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        sequence(n,1);
    }

    static void sequence(int n, int count){
        if(n == 1){
            System.out.println(count);
            return;
        }

        if(n % 2 == 0){
            n /= 2;
            count++;
        } else{
            n = 3*n+1;
            count++;
        }

        sequence(n,count);
    }
}
