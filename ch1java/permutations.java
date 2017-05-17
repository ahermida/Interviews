public class permutations {
    public static void main(String[] args) {
        //one way would be to actually generate all permutations, but that would be O(N!)
        //instead we could check the frequency of each char
        System.out.println("Checking and & dna: " + checkPerm("and", "dna"));
        System.out.println("Checking boo and shoe: " + checkPerm("boo", "shoe"));
    }
    public static boolean checkPerm(String s1, String s2) {
        int[] s1count = new int[256];
        int[] s2count = new int[256];
        for (char c: s1.toCharArray()) {
            s1count[(int) c]++;
        }
        for (char c: s2.toCharArray()) {
            s2count[(int) c]++;
        }
        for (int i = 0; i < 256; i++) { 
            if (s1count[i] != s2count[i]) {
                return false;
            }
        }
        return true;
    }
}
