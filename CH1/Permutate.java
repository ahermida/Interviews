public class Permutate {
    public static void main(String[] args) {
        System.out.println(permy("doood ccaammeellss"));
        System.out.println(permy("tact coa"));
        System.out.println(permy("hamburger"));
    }
    public static boolean permy(String s) {
        int[] seen = new int[256];
        for (char c: s.toCharArray()) {
            if (c != ' ') {
                seen[(int) c]++;
            }
        }
        boolean seenOdd = false;
        for (int i = 0; i < 255; i++) {
            if (seen[i] % 2 != 0) {
                if (seenOdd) {
                    return false;
                }
                seenOdd = true;
            }
        }
        return true;
    }
}
