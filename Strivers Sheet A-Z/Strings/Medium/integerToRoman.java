import java.util.Scanner;

public class integerToRoman {
    static String intToROman(int num) {
        if (num <= 0 || num > 3999) {
            return "Invalid number (Roman numerals support 1–3999)";
        }
        StringBuilder sb = new StringBuilder();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romans = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(romans[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("The sorted string is : " + intToROman(num));
    }
}
