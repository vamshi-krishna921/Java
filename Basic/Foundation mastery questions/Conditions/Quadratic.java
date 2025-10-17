import java.util.*;
import java.lang.Math;;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ! Equation = -b +- Root((b**2) -4ac)/2a
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the value 0f b : ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();
        sc.nextLine();
        double Eqn1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double Eqn2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        if (Eqn1 > 0) {
            System.out.println(Eqn1);
        } else {
            System.out.println(Eqn2);
        }

    }
}
