import java.util.*;

public class BasicIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ! Take user input (name, age) and print a greeting in same line
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, I am " + name + ". My age is " + age);

        // ! Convert temperature from Celsius to Fahrenheit
        // * */ formula = (Celsius * 9/5) + 32
        System.out.print("Enter the Celsius : \n");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * (9 / 5)) + 32;
        System.out.println("Temperature in fahrenheit is : " + fahrenheit);

    }

}
