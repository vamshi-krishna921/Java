public class fnOverloading {
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(int a, int b, float c) {
        return a + b + c;
    }

    static float sum(float a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 40));
        System.out.println(sum(10, 10, 10.1f));
        System.out.println(sum(20.1f, 10));
    }
}
