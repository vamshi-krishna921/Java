import java.util.*;
public class ScannerEg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Word
        System.out.println("Enter a word : ");
        String word = scan.next();
        // Line
        scan.nextLine();
        System.out.println("Enter a line : ");
        String line = scan.nextLine();
        // Numbers
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        // Float 
        System.out.println("Enter the decimal number");
        float dec = scan.nextFloat();
        // Double 
        System.out.println("Enter the double decimal number: ");
        double decDouble = scan.nextDouble();

        //* Outputs */
        System.out.println("Outputs are as follows");
        System.out.println("The word is: " + word);
        System.out.println("The line is :" + line);
        System.out.println("The integer is :" + number);
        System.out.println("The floating decimal number is :" + dec);
        System.out.println("The double decimal number is :" + decDouble);


    }

}