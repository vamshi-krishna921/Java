import java.util.Scanner;

public class ReverseWords {

    static String reverseStr(String str) {
        String[] string = str.split(" +");
        int left = 0;
        int right = string.length - 1;
        while (left < right) {
            String word = string[left];
            string[left] = string[right];
            string[right] = word;
            left++;
            right--;
        }
        str = String.join(" ", string);
        return str.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = reverseStr(str);
        System.out.println(result);
    }
}
