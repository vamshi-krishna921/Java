import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByFirstChar {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "ant", "blueberry", "cherry" , "blackberry"};
        Map<Character, List<String>> map = new HashMap<>();
        for (String word : words) {
            char firstChar = word.charAt(0);
            map.computeIfAbsent(firstChar, k -> new ArrayList<>())
                    .add(word);
        }
        System.out.println(map);
    }
}