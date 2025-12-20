import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        String str = sc.next();
        str = str.toLowerCase();
        char ch = str.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print(ch + " is a vowel");
        } else {
            System.out.print(ch + " is a consonant");
        }
    }
}
