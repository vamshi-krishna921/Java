import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        int temp = number;
        sc.nextLine();
        int revNum = 0;
        while (number != 0) {
            int num = number % 10;
            revNum = (revNum * 10) + num;
            number /= 10;
        }
       if (temp == revNum) {
            System.out.println("The given is number is Palindrome");
       } else{
        System.out.println("the given number is not Palindrome");
       }
        sc.close();
    }
}

