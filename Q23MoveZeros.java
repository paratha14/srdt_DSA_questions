// Question 23: Move Zeros to End
// Move all 0's to end in-place while keeping order of non-zero elements.
// Sample Input: [0,1,0,3,12]
// Sample Output: [1,3,12,0,0]

import java.util.Arrays;
import java.util.Scanner;

public class Q23MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) nums[pos++] = nums[i];
        }
        while (pos < n) nums[pos++] = 0;

        System.out.println(Arrays.toString(nums));
    }
}
