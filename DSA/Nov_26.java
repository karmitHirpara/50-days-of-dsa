package DSA;

// LeetCode 443 — String Compression
// --------------------------------------------------------------------


public class Nov_26 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int len = compress(chars);
        System.out.println("Compressed Length: " + len);
    }

    private static int compress(char[] chars) {
        int write = 0;   // index to write compressed characters
        int read = 0;    // index to read original array
        int n = chars.length;

        while (read < n) {
            char current = chars[read];
            int count = 0;

            // count consecutive repeating characters
            while (read < n && chars[read] == current) {
                read++;
                count++;
            }

            // write the character
            chars[write++] = current;

            // write the count if > 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
