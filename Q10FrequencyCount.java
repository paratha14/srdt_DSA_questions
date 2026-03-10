// Question 10: Frequency Count of Array Elements
// Print how many times each integer has occurred in the array.
// Sample Input: 10 elements -> 1 2 3 3 4 1 4 5 1 2
// Sample Output:
// 1 occurs 3 times
// 2 occurs 2 times
// 3 occurs 2 times ...

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q10FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
