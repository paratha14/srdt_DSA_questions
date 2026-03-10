// Question 2: Pythagorean Triplets
// Generate all Pythagorean triplets with values smaller than a given limit.
// Sample Input: 20
// Sample Output:
// 3 4 5
// 8 6 10
// 5 12 13 ...

import java.util.Scanner;

public class Q2PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int c2 = a * a + b * b;
                int c = (int) Math.sqrt(c2);
                if (c * c == c2 && c <= limit) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
}
