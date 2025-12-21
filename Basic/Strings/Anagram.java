import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the string2 : ");
        String str2 = sc.nextLine();
        if (isAnagram(str1,str2)) {
            System.out.println("The both strings are equal and anagrams.");
        }else{
            System.out.println("The both strings are not equal and not anagrams.");
        }
    }
}