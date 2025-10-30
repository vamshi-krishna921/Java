import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int orgNum  = num;
        int fact = 1;
        int sum = 0;
        while (num!=0) {
            int digit = num %10;
            fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num/=10;
        }
        if (orgNum == sum) {
            System.out.println("It is Strong number");
        } else {
            System.out.println("Not a Strong number");
        }
    }
}
