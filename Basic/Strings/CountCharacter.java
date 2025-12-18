import java.util.Scanner;

public class CountCharacter {
    static void countChar(String str, char ch) {
        if (!str.contains(String.valueOf(ch))) {
            System.out.print("The " + ch + " is not present in " + str);
        } else {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            System.out.print("The " + ch + " repeated for " + count + " times.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string : ");
        str = sc.nextLine();
        System.out.print("Enter the character to count : ");
        char ch = sc.next().charAt(0);
        countChar(str, ch);
    }
}
