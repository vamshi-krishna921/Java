import java.util.Scanner;

public class GasStations {
    static double minMaxDist(int[] arr, int K) {
        int n = arr.length;
        int[] howMany = new int[n - 1];
        for (int gas = 1; gas <= K; gas++) {
            double maxSection = -1;
            int maxIndex = -1;
            for (int i = 0; i < n - 1; i++) {
                double diff = arr[i + 1] - arr[i];
                double sectionLength = diff / (howMany[i] + 1);
                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxIndex = i;
                }
            }
            howMany[maxIndex]++;
        }
        double maxAns = -1;
        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            double sectionLength = diff / (howMany[i] + 1);
            maxAns = Math.max(maxAns, sectionLength);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of stations:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no of stations want to add: ");
        int t = sc.nextInt();
        System.out.print("The result is " + minMaxDist(arr, t));
    }
}
