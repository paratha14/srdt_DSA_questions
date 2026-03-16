public class Q29StringCompression {
    public static String compress(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == c) {
                i++;
                count++;
            }
            result.append(c).append(count);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aabbbbeeeeffggg"));
    }
}
