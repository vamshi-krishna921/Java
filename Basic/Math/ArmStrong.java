import java.util.*;
import java.lang.Math;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = sc.nextInt();
        int temp = input;
        int exponent = String.valueOf(input).length();
        int armStrong = 0;
        while (input != 0) {
            int digit = input % 10;
            armStrong = (int) (armStrong + (Math.pow(digit, exponent)));
            input = input / 10;
        }
        if (temp == armStrong) {
            System.out.println( temp + " is an arm strong number");
        }else{
            System.out.println( temp + " is not an arm strong number");
        }
    }
}
