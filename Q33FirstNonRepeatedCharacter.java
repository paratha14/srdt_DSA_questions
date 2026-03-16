public class Q33FirstNonRepeatedCharacter {
    public static char firstNonRepeated(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) return c;
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("swiss"));
    }
}
