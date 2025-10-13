public class Wrapper {
    public static void main(String[] args) {
        int a = 10; //* Primitive
        Integer b = a; //* Autoboxing
        int c = b; //* Unboxing
        System.out.println("Primitive :" + a);
        System.out.println("Autoboxing :" + b);
        System.out.println("Unboxing :" + c);
    }
}
