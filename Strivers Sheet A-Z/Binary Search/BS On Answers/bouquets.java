import java.util.Scanner;

public class bouquets {
    static int[] findMinMax(int[] bloom) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < bloom.length; i++) {
            min = Math.min(bloom[i], min);
            max = Math.max(bloom[i], max);
        }
        return new int[] { min, max };
    }

    static int search(int[] bloom, int m, int k) {
        int n = bloom.length;
        if (m * k > n) {
            return -1;
        }

        int minMax[] = findMinMax(bloom);
        // ! Brute force O((max-min) * n)
        // int min = minMax[0], max = minMax[1];
        // for (int i = min; i <= max; i++) {
        // int ans = 0;
        // int j = 0, count = 0;
        // while (j < n) {
        // if (bloom[j] <= i) {
        // count++;
        // } else {
        // ans += count / k;
        // count = 0;
        // }
        // j++;
        // }
        // ans += count / k;
        // if (ans >= m) {
        // return i;
        // }
        // }

        // TODO Optimal using Binary search O(logn * n)
        int low = minMax[0], high = minMax[1];
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ans = 0;
            int j = 0, count = 0;
            while (j < n) {
                if (bloom[j] <= mid) {
                    count++;
                } else {
                    ans += count / k;
                    count = 0;
                }
                j++;
            }
            ans += count / k;
            if (ans >= m) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter the days of" + size + "flower to bloom: ");
        int[] bloom = new int[size];
        for (int i = 0; i < size; i++) {
            bloom[i] = sc.nextInt();
        }
        System.out.print("Enter the no of bouquets: ");
        int m = sc.nextInt();
        System.out.print("Enter the no of flowers in each bouquet: ");
        int k = sc.nextInt();
        System.out.println("The no of days needed: " + search(bloom, m, k));
    }
}
