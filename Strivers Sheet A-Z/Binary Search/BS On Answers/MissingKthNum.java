import java.util.Scanner;

public class MissingKthNum {
    static int search(int arr[], int t){
        //TODO Optimal
        for (int elem: arr) {
            if (elem <= t) {
                t++;
            }else{
                return t;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int t = sc.nextInt();
        System.out.print("The result is " + search(arr, t));
    }
}
