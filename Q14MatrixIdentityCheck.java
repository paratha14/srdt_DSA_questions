// Question 14: Matrix Identity Check
// Check if two given matrices are identical.
// Sample Input: A = [[1,1,1,1],[2,2,2,2],[3,3,3,3],[4,4,4,4]]
//               B = [[1,1,1,1],[2,2,2,2],[3,3,3,3],[4,4,4,4]]
// Sample Output: Matrices are identical

public class Q14MatrixIdentityCheck {
    public static void main(String[] args) {
        int[][] A = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int[][] B = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};

        if (areIdentical(A, B)) {
            System.out.println("Matrices are identical");
        } else {
            System.out.println("Matrices are not identical");
        }
    }

    static boolean areIdentical(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) return false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) return false;
            }
        }
        return true;
    }
}
