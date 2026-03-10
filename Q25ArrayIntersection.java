// Question 25: Intersection of Two Arrays
// Return unique elements present in both arrays (any order).
// Sample Input: nums1=[1,2,2,1], nums2=[2,2]
// Sample Output: [2]

import java.util.HashSet;
import java.util.Scanner;

public class Q25ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(sc.nextInt());

        int n2 = sc.nextInt();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            if (set1.contains(val)) result.add(val);
        }
        System.out.println(result);
    }
}
