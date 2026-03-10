// Question 5: Dealership Tyres Calculator
// Given number of dealerships and cars/bikes count, calculate total tyres.
// Cars = 4 tyres, Bikes = 2 tyres.
// Sample Input: 3 dealerships -> (4,2), (4,0), (1,2)
// Sample Output: 20, 16, 8

import java.util.Scanner;

public class Q5DealershipTyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            System.out.println((cars * 4) + (bikes * 2));
        }
    }
}
