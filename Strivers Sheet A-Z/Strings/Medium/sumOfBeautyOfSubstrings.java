import java.util.Scanner;

public class sumOfBeautyOfSubstrings {

    static int mininumfreq(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                min = Math.min(min, arr[i]);
            }
        }
        return min;
    }

    static int Beauty(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int[] freq = new int[26];
            int max = Integer.MIN_VALUE;
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                freq[ch - 'a']++;
                int temp = freq[ch - 'a'];
                max = Math.max(max, temp);
                int min = mininumfreq(freq);
                sum += max - min;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("The sum of Beauty 0f all substrings : " + Beauty(str));
    }
}
