public class isUnique {
    public static void main(String[] args) {
        System.out.println("Is yada unique ? : " + isUnique("yada"));
        System.out.println("Is torch unique ? : " + isUnique("torch"));
    }
    
    //check if string has all unique chars
    public static boolean isUnique(String str) {
        
        //theres an ascii hack
        char[] arr = str.toCharArray();
        boolean[] seen = new boolean[256];
        for (char c: arr) {
            if (seen[(int) c]) {
                return false;
            } else {
                seen[(int) c] = true;
            }
        }
        return true;
    }
}
