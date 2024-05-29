CodeForces Questions

Q. 4A Print Summation of an array (https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/L)\
import java.util.Scanner;

public class Practise {
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

Q. Way too long words (https://codeforces.com/problemset/problem/71/A)
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s=sc.next();
            if(s.length() > 10){
                System.out.println(s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}

Q. Elephant (https://codeforces.com/problemset/problem/617/A)
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();

        long count = (num+4) / 5; // Add 4 and divide by 5 to round up to the nearest multiple of 5

        System.out.println(count);
    }
}

Q. Fibonacci (https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/O)
import java.util.Scanner;

public class Practise {
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

Q. Suffix Sum (https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/M)
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

Q. Bear and Big Brother (https://codeforces.com/problemset/problem/791/A)
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long limak = sc.nextInt();
        long bob = sc.nextInt();

        long count=0;

        while(limak <= bob){
        limak *= 3;
        bob *= 2;
        count++;
        }  
    System.out.println(count);
    }
}

Q. Word Capitalization (https://codeforces.com/problemset/problem/281/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();

        System.out.println(capitalization(word));
    }
    static String capitalization(String word){

        if(Character.isLowerCase(word.charAt(0)) ){
            return Character.toUpperCase(word.charAt(0)) + word.substring(1);
        } else{
            return word;
        }
    }
}

Q. Next Round (https://codeforces.com/contest/158/problem/A)
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int kS = arr[k - 1];
        int sum = 0;

        for(int i=0;i<n;i++){
            if(arr[i] >= kS && arr[i] > 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

Q. George and Accommodation (https://codeforces.com/problemset/problem/467/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        long count = 0;

        for(int i = 1;i<=n;i++){
            long p = sc.nextLong();
            long q = sc.nextLong();

            if(q - p >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}

Q. Soldier and Bananas (https://codeforces.com/problemset/problem/546/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(); 
        int n=sc.nextInt();
        int w=sc.nextInt();

        int sum=0;

        for(int i=1;i<=w;i++){
            sum += i*k;
        }

        int result = sum - n;

        if(result < 0){
            System.out.println(0);
        } else{
            System.out.println(result);
        }
    }
}

Q. Anton and Danik (https://codeforces.com/problemset/problem/734/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String word=sc.next();

        int A=0;
        int D=0;

        if(word.length() != n){
            return;
        }

        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'A'){
                A++;
            } else if(word.charAt(i) == 'D'){
                D++;
            }
        }

        if(A > D){
            System.out.println("Anton");
        } else if(D > A){
            System.out.println("Danik");
        } else{
            System.out.println("Friendship");
        }
    }
}

Q. Translation (https://codeforces.com/problemset/problem/41/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();

        if (t.length() != s.length()) {
            System.out.println("NO");
            return;
        }

        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString(); 

        System.out.println(t.equals(reversed) ? "YES" : "NO");
    }
}

Q. Word (https://codeforces.com/problemset/problem/59/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word = sc.next();

        int small = 0;
        int big = 0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)){
                small++;
            } else{
                big++;
            }
        }

        if(small < big){
            word = word.toUpperCase();
        } else{
            word = word.toLowerCase();
        }

        System.out.println(word);
    }
}

Q. Vanya and Fence (https://codeforces.com/problemset/problem/677/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum = 0;

        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] =sc.nextInt();

            if(h[i] > k){
                sum += 2;
            } else{
                sum++;
            }
        }

        System.out.println(sum);
    }
}

Q. Vasya the Hipster (https://codeforces.com/problemset/problem/581/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(a == b){
            System.out.println(a + " " + 0);
        }

        if(a > b){
            System.out.print(b + " " + (a-b)/2);
        } else if (b > a){
            System.out.print(a + " " + (b-a)/2);
        }
    }
}

Q.  Again Twenty Five! (https://codeforces.com/contest/630/problem/A)
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        if(n == 0){
            System.out.println(1);
        } else if(n == 1){
            System.out.println(5);
        } else {
            System.out.println(25); // For n >= 2, 5^n ends in "25"
        }
    }
}

Q. Hit the Lottery (https://codeforces.com/problemset/problem/996/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long count = 0;

        while(n > 0){
            if(n >= 100){
                count++;
                n -= 100;
            } else if(n >= 20){
                count++;
                n -= 20;
            } else if(n >= 10){
                count++;
                n -= 10;
            } else if(n >= 5){
                count++;
                n -= 5;
            } else{
                count++;
                n -= 1;
            }
        }

        System.out.println(count);
    }
}

Q. Wrong Subtraction (https://codeforces.com/problemset/problem/977/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        long num = sc.nextLong();
        long k = sc.nextLong();

        for(int i=1;i<=k;i++){
            if(num % 10 > 0){
                num--;
            } else{
                num /= 10;
            }
        }

        System.out.println(num);
    }
}

Q. Mishka and Game (https://codeforces.com/problemset/problem/703/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int chris = 0;
        int mishka = 0;

        int[] M=new int[n];
        int[] C = new int[n];

        for(int i=0;i<n;i++){
            M[i]=sc.nextInt();
            C[i]=sc.nextInt();

            if(M[i] > C[i]){
                mishka++;
            } else if(C[i] > M[i]){
                chris++;
            } else{
                mishka++;
                chris++;
            }
        }

        if(mishka > chris){
            System.out.println("Mishka");
        } else if(chris > mishka){
            System.out.println("Chris");
        } else{
            System.out.println("Friendship is magic!^^");
        }
    }
}

Q. To My Critics (https://codeforces.com/problemset/problem/1850/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] a=new int[n];
        int[] b =new int[n];
        int[] c = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();

            if(a[i]+b[i] >=10 || b[i]+c[i]>=10 || a[i]+c[i] >=10){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

Q. Sum (https://codeforces.com/problemset/problem/1742/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] a=new int[n];
        int[] b =new int[n];
        int[] c = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();

            if(a[i]+b[i] == c[i] || b[i]+c[i] == a[i] || a[i]+c[i] == b[i]){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

Q. Odd one out (https://codeforces.com/problemset/problem/1915/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] a=new int[n];
        int[] b =new int[n];
        int[] c = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();

            if(a[i] == b[i]){
                System.out.println(c[i]);
            } else if(b[i] == c[i]){
                System.out.println(a[i]);
            } else{
                System.out.println(b[i]);
            }
        }
    }
}

Q. Love story (https://codeforces.com/problemset/problem/1829/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "codeforces";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String word = sc.nextLine();
            
            if (word.length() != s.length()) {
                System.out.println("Error: Length of input word must be the same as 'codeforces'");
                return;
            }

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != word.charAt(j)) {
                    count++;
                }
            }

            System.out.println(count);
            count = 0; // Reset count for the next word
        }
    }
}

Q. Log2 (https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/P)
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

Q. Palindrome Array (https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/R)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalindrome(arr, 0, n - 1) ? "YES" : "NO");
    }

    static boolean isPalindrome(int[] arr, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (arr[start] != arr[end]) {
            return false;
        }

        return isPalindrome(arr, start + 1, end - 1);
    }
}

Q. Mahmoud and Ehab and the even-odd game (https://codeforces.com/problemset/problem/959/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();

        if(n % 2 == 0){
            System.out.println("Mahmoud");
        } else{
            System.out.println("Ehab");
        }
    }
}

Q. Stair, Peak, or Neither? (https://codeforces.com/problemset/problem/1950/A)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();

            if(a[i] < b[i] && b[i] < c[i]){
                System.out.println("STAIR");
            } else if(a[i] < b[i] && b[i] > c[i]){
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
    }
}

Q. Array Average (https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/S)
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        double average = calculateAverage(arr);
        System.out.printf("%.6f", average);
    }

    static double calculateAverage(long[] arr) {
        long sum = 0;

        for (long element : arr) {
            sum += element;
        }

        return (double) sum / arr.length;
    }
}
