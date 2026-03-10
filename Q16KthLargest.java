// Question 16: Kth Largest Element in an Array (without full sorting)
// Return the kth largest element using a min-heap of size k.
// Sample Input: nums = [3,2,1,5,6,4], k = 2
// Sample Output: 5

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q16KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findKthLargest(nums, k));
    }

    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}
