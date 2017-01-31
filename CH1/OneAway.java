public class OneAway {

    //IS WRONG -- doesn't consider order -- mlp and plme would be one edit away
    public static void main(String[] args) {
        System.out.println(isOneAway("plm", "pldm"));
        System.out.println(isOneAway("sla", "RAMEN"));
    }
    public static boolean isOneAway(String s1, String s2) {
        int[] s1Rep = new int[256];
        int[] s2Rep = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            s1Rep[(int) s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            s2Rep[(int) s2.charAt(i)]++;
        }
        
        boolean diffSeen = false;
        for (int i = 0; i < 255; i++) {
            if (s1Rep[i] != s2Rep[i]) {
                if (diffSeen) {
                    return false;
                }
                diffSeen = true;
                if (isDisqualified(s1Rep[i], s2Rep[i])) {
                    return false;
                }
            } 
        }
        return true;
    }
    private static boolean isDisqualified(int i, int j) {
        int max = Math.max(i, j);
        int min = Math.min(i, j);
        if (max - min > 1) {
            return true;
        } else {
            return false;
        }
    }
}
