// Question 7: Find Factors of a Number (FindFactor)
// If input is negative, ignore the sign. If zero, print "No Factors".
// Sample Input: 54
// Sample Output: 1,2,3,6,9,18,27,54

import java.util.Scanner;

public class Q7FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if (n == 0) {
            System.out.println("No Factors");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (sb.length() > 0) sb.append(",");
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }
}
