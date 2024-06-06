import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num =sc.nextLong();
        long[] arr=new long[(int) num];

        for(long i=0;i<num;i++){
            arr[(int) i] = sc.nextLong();
        }

        long sum = summation(num-1, arr);
        System.out.println(sum);
    }
  
    static long summation(long index, long[] arr){
        if(index < 0){
            return 0;
        }
        return arr[(int) index] + summation(index-1, arr);
    }
}
