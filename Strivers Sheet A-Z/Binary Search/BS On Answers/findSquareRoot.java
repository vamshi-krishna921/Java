import java.util.Scanner;

public class findSquareRoot {

    static int ans(int num) {
        int ans = 1;
        // *Better O(n) and optimal
        // for (int i = 1; i <= num; i++) {
        //     if (i * i <= num) {
        //         ans = i;
        //     } else {
        //         break;
        //     }
        // }

        //TODO Binary search O(logn)
        int low = 0, high = num;
        while (low<=high) {
            int mid = low + (high - low)/2;
            if(mid*mid <= num){
                ans = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        System.out.print("The answer is " + ans(num));
    }
}
