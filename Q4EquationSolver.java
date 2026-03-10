// Question 4: Solve equation a³ + a²b + 2a²b + 2ab² + ab² + b³
// Simplifies to (a+b)³ = a³ + 3a²b + 3ab² + b³
// Sample Input: a=2, b=3
// Sample Output: 125

import java.util.Scanner;

public class Q4EquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = (long)(Math.pow(a, 3)) + (a*a*b) + 2*(a*a*b) + 2*(a*b*b) + (a*b*b) + (long)(Math.pow(b, 3));
        System.out.println("Result: " + result);
    }
}
