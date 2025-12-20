import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String[] splittedString = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : splittedString) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            result.append(sb).append(" ");
        }
        result.toString().trim();
        System.out.println(result);
    }
}
