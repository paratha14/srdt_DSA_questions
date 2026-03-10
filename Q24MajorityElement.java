// Question 24: Majority Element
// Find the element appearing more than n/2 times. (Always exists)
// Sample Input: [3,2,3]
// Sample Output: 3

import java.util.Scanner;

public class Q24MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int candidate = nums[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 0) { candidate = nums[i]; count = 1; }
            else if (nums[i] == candidate) count++;
            else count--;
        }
        System.out.println(candidate);
    }
}
