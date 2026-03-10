// Question 17: Missing Number
// Given array of n distinct numbers in range [0,n], find the missing one.
// Sample Input: [3,0,1]
// Sample Output: 2

import java.util.Scanner;

public class Q17MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) actual += num;

        System.out.println(expected - actual);
    }
}
