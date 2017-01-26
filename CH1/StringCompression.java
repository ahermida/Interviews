public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("Suuuuuuuuuuuuuuuuuper"));
    }
    public static String compress(String s) {
        int count = 0;
        char curr = '\u0000';
        String build = "";
        for (int i = 0; i < s.length(); i++) {
            if (curr != s.charAt(i) && i != 0 && curr != '\u0000') {
                build += count;
            }
            if (curr != s.charAt(i)) {
                curr = s.charAt(i);
                build += curr;
                count = 1;
            } else {
                count++;
            }
        }
        build += count;
        if (s.length() < build.length()) {
            return s;
        } else {
            return build;
        }
    }
}
