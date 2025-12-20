import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.nextLine();
        int maxLength = 0, tempLength = 0;
        String[] splittedString = str.split(" ");
        String longWord = "";
        int maxLen = 0;
        for (String word : splittedString) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                longWord = word;
            }
        }
        System.out.print("The word is " + longWord + " the length is " + maxLen);
    }
}
