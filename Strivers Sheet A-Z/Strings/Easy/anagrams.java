import java.util.HashMap;
import java.util.Scanner;

public class anagrams {
    static boolean isAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // *Better soln using hashmap()
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char ch1 = s.charAt(i);
        //     map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        // }
        // for (int i = 0; i < t.length(); i++) {
        //     char ch2 = t.charAt(i);
        //     if (!map.containsKey(ch2)) {
        //         return false;
        //     }
        //     map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        //     if (map.get(ch2) == 0) {
        //         map.remove(ch2);
        //     }
        // }
        // return map.isEmpty();

        //TODO Optimal using frequency count
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            arr[ch1 - 'a']++;
            arr[ch2 - 'a']--; 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string1: ");
        String s = sc.nextLine();
        System.out.print("Enter the string2: ");
        String t = sc.nextLine();
        if (isAnagrams(s, t)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
