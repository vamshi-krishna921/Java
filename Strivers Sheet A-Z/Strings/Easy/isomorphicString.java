import java.util.HashMap;
import java.util.Scanner;

public class isomorphicString {

    static boolean isIsomrphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // * Better soln(Hashmap)
        // HashMap<Character, Character> map1 = new HashMap<>();
        // HashMap<Character, Character> map2 = new HashMap<>();
        // for (int i = 0; i < str1.length(); i++) {
        // char ch1 = str1.charAt(i);
        // char ch2 = str2.charAt(i);
        // if (map1.containsKey(ch1)) {
        // if (map1.get(ch1) != ch2) {
        // return false;
        // }
        // } else {
        // map1.put(ch1, ch2);
        // }
        // if (map2.containsKey(ch2)) {
        // if (map2.get(ch2) != ch1) {
        // return false;
        // }
        // } else {
        // map2.put(ch2, ch1);
        // }
        // }
        // return true;

        // TODO Optimal using arrays because arrays has less complexity that the strings
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (arr1[ch1] != arr2[ch2]) {
                return false;
            }
            arr1[ch1] = i+1;
            arr2[ch2] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string one : ");
        String str1 = sc.next();
        System.out.print("Enter the string two : ");
        String str2 = sc.next();
        if (isIsomrphic(str1, str2)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

    }
}
