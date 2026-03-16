import java.util.HashMap;

public class Q22CountPairsWithGivenSum {
    public static int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            count += map.getOrDefault(complement, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1, 5, 7, -1, 5}, 6));
        System.out.println(countPairs(new int[]{1, 1, 1, 1}, 2));
        System.out.println(countPairs(new int[]{10, 12, 10, 15, -1}, 125));
    }
}
