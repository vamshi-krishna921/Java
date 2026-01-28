import java.util.Scanner;

public class longestPalindromeSubstring {
    static String longestPalindrome(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String longestSubstring = "";
        for (int i = 1; i < str.length(); i++) {
            // For odd length
            int low = i, high = i;
            while (low >= 0 && high < str.length()
                    && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }
            String tempSubString = str.substring(low + 1, high);
            if (tempSubString.length() > longestSubstring.length()) {
                longestSubstring = tempSubString;
            }

            // For even length
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length()
                    && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }
            tempSubString = str.substring(low + 1, high);
            if (tempSubString.length() > longestSubstring.length()) {
                longestSubstring = tempSubString;
            }
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("The longest palindrome substring is : " + longestPalindrome(str));
    }
}
