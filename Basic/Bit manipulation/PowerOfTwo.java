import java.util.Scanner;
public class PowerOfTwo {
    static boolean isPower(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isPower(num)) {
            System.out.println(num + " is power of 2.");
        }else{
            System.out.println(num + " not power of 2.");
        }
    }
} 