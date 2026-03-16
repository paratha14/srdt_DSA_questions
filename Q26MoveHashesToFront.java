public class Q26MoveHashesToFront {
    public static String moveHashes(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') count++;
            else result.append(c);
        }
        StringBuilder hashes = new StringBuilder();
        for (int i = 0; i < count; i++) hashes.append('#');
        return hashes.append(result).toString();
    }

    public static void main(String[] args) {
        System.out.println(moveHashes("Move#Hash#to#Front"));
    }
}
