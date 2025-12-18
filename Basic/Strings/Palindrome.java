import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
             return false;   
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = new String();
        str = sc.next();
        if (isPalindrome(str)) {
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");

        }
    }
}
