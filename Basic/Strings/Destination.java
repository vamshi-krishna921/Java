import java.util.Scanner;

public class Destination {
    static int direction(String dir) {
        int x = 0, y = 0;
        for (int i = 0; i < dir.length(); i++) {
            if (dir.charAt(i) == 'N') {
                y++;
            } else if (dir.charAt(i) == 'S') {
                y--;
            } else if (dir.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x1 = x * x;
        int y1 = y * y;
        return (int) Math.sqrt(x1 + y1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the direction string in CAPS: ");
        String dir = new String();
        dir = sc.next();
        System.out.println("The distance is : " + direction(dir) + " km.");
    }
}
