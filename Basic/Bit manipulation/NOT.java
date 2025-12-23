import java.util.Scanner;

public class NOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int a = sc.nextInt();
        System.out.print(~a);
    }
}
