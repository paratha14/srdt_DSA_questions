import java.util.Arrays;

public class Q12SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 7, 7, 5};
        printSecond(arr1);

        int[] arr2 = {1};
        printSecond(arr2);
    }

    public static void printSecond(int[] arr) {
        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
        int n = sorted.length;
        System.out.println("Second Smallest : " + (n >= 2 ? sorted[1] : -1));
        System.out.println("Second Largest  : " + (n >= 2 ? sorted[n - 2] : -1));
    }
}
