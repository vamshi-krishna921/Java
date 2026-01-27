import java.util.HashMap;
import java.util.Scanner;

public class romanToInteger {

    static int toInteger(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if (str.length() == 1) {
            return map.get(str.charAt(0));
        }
        int result = 0;
        for (int i = 0; i < str.length()-1; i++) {
            int cur = map.get(str.charAt(i));
            int next = map.get(str.charAt(i + 1));
            if (cur < next) {
                result -= cur;
            } else {
                result += cur;
            }
        }
        result += map.get(str.charAt(str.length() - 1));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("The integer is : " + toInteger(str));
    }
}
