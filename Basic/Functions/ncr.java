import java.util.Scanner;
public class ncr {

    //* Factorial
    static int factorial(int value){
        int fact = 1;
        for (int i = 1; i <= value; i++) {
            fact *= i;
        }
        return fact;
    }

    //* nCr
    static int nCr(int n, int r){
        if (r>n) {
            return 0;
        }else{
            return (factorial(n)/(factorial(r) * (factorial(n-r))));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();
        System.out.print("Enter the r value : ");
        int r = sc.nextInt();
        System.out.println("The nCr = " + nCr(n,r));
    }
}
