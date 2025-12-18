import java.util.Scanner;
public class PrintEachChar {
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string : ");
        str = sc.nextLine();
        printEachChar(str);
    }
}
