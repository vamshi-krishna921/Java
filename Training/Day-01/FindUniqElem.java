public class FindUniqElem {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 7, 2, 5, 9, 1 };
        // int uniqueElem = 0;
        int[] count = new int[10];
        // for (int num : numbers) {
        //     uniqueElem ^= num;
        // }
        for (int num : numbers) {
            count[num]++;
        }
        int uniqueElem = -1;
        for (int i = 0; i < 10; i++) {
            if (count[i] == 1) {
                uniqueElem = i;
                break;
            }
        }
        System.out.println("The unique element is: " + uniqueElem);
    }
}
