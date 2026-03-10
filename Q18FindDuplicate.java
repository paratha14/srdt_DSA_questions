// Question 18: Find Duplicate Number
// Array of size N+1 with elements in range 1 to N. Find the one duplicate.
// Sample Input: [1,3,4,2,2]
// Sample Output: 2

import java.util.HashSet;
import java.util.Scanner;

public class Q18FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println(num);
                return;
            }
        }
    }
}
