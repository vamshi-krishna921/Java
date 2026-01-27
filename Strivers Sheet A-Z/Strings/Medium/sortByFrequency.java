import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sortByFrequency {

    static String sorted(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        for (char ch : list) {
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("The sorted string is : " + sorted(str));
    }
}
