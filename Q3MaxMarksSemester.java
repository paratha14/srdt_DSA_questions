// Question 3: Maximum Marks Per Semester
// Input no of semesters, subjects per semester, and marks (0-100).
// Print max mark per semester or "You have entered invalid mark."
// Sample Input: 3 semesters, marks: 50 60 70 | 90 98 76 67 | 89 76
// Sample Output: Maximum mark in 1 semester: 70

import java.util.Scanner;

public class Q3MaxMarksSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semesters = sc.nextInt();
        for (int i = 1; i <= semesters; i++) {
            int subjects = sc.nextInt();
            int max = -1;
            boolean valid = true;
            for (int j = 0; j < subjects; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    valid = false;
                    break;
                }
                if (mark > max) max = mark;
            }
            if (valid) {
                System.out.println("Maximum mark in " + i + " semester: " + max);
            }
        }
    }
}
