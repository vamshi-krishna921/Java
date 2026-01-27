import java.util.Scanner;

public class countSubstringwithKFreq {

    static int countFreq(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int result = 0, left = 0;
        for (int right = 0; right < n; right++) {
            int c = s.charAt(right) - 'a';
            freq[c]++;
            while (freq[c] >= k) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            result += left;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the appearance of an elem (frequency): ");
        int k = sc.nextInt();
        System.out.print("The frequency : " + countFreq(str, k));
    }
}
