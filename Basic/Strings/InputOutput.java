import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.println("Your name is " + name);
        //* Array of string 
        System.out.println("Enter the array of strings.");
        String[] langs = new String[3];
        for (int i = 0; i < langs.length; i++) {
            langs[i] = sc.nextLine();
        }
        for (int i = 0; i < langs.length; i++) {
            System.out.print(langs[i] + " ");
        }
    }
}
