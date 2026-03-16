public class Q28CountingValleys {
    public static int countingValleys(String path) {
        int level = 0, valleys = 0;
        for (char c : path.toCharArray()) {
            if (c == 'U') level++;
            else level--;
            if (c == 'U' && level == 0) valleys++;
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys("UDDDUDUU"));
    }
}
