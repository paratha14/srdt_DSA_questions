// Question 6: Find Item(s) with Minimum Discount Amount
// Input: N items with name,price,discount%. Print item(s) with lowest discount amount.
// Sample Input: 4 items -> mobile,10000,20 | shoe,5000,10 | watch,6000,15 | laptop,35000,5
// Sample Output: shoe

import java.util.Scanner;
import java.util.ArrayList;

public class Q6MinDiscountItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        int[] discountAmounts = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(",");
            names[i] = parts[0];
            int price = Integer.parseInt(parts[1]);
            int pct = Integer.parseInt(parts[2]);
            discountAmounts[i] = (price * pct) / 100;
        }

        int min = discountAmounts[0];
        for (int d : discountAmounts) {
            if (d < min) min = d;
        }

        for (int i = 0; i < n; i++) {
            if (discountAmounts[i] == min) {
                System.out.println(names[i]);
            }
        }
    }
}
