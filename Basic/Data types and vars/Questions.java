import java.util.*;

public class Questions {
    public static void main(String[] args) {
        // ! Average of 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num 3: ");
        int num3 = sc.nextInt();
        float avg = ((num1 + num2 + num3) / 3f);
        System.out.println("The average of 3 numbers is : " + avg);

        // ! Area of square
        System.out.println("Enter the side of square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of square is : " + area);

        // ! GST + cost
        System.out.println("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();
        float amount = (pencil + pen + eraser);
        float gst = (amount * 18 / 100f);
        float totalAmount = amount + gst;
        System.out.println("The total amount including GST is : " + totalAmount);
    }
}