import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        countVowels(word, 0, 0);
    }

    static void countVowels(String word, int index, int count) {
        if (word.length() == index) {
            System.out.println(count);
            return;
        }

        char currentChar = word.charAt(index);
        if (Character.toLowerCase(currentChar) == 'a' ||
                Character.toLowerCase(currentChar) == 'e' ||
                Character.toLowerCase(currentChar) == 'i' ||
                Character.toLowerCase(currentChar) == 'o' ||
                Character.toLowerCase(currentChar) == 'u') {
            count++;
        }

        countVowels(word, index + 1, count);
    }
}
