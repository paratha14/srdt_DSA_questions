// Question 1: Check if a Number is Prime
// Write a function to check if a given number is prime.
// Sample Input: 29
// Sample Output: true

import java.util.Scanner;

public class Q1CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
