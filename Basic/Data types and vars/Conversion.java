public class Conversion {
    public static void main(String[] args) {

        // Implicit or type conversion
        int num = 10;
        float dec = num;
        System.out.println(dec);

        // Explicit or type casting
        double d = 10.99;
        int num1 = (int) d;
        System.out.println(num1);

        // Char to int
        char letter = 'A';
        int letterCode = (int) letter;
        char re_assign_letter = (char) letterCode;
        System.out.println("ASCII code of A :" + letterCode);
        System.out.println("Converted to orignal : " + re_assign_letter);
    }

}
