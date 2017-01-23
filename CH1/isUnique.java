import java.util.*;

public class isUnique {
    public static void main(String[] args) {
        System.out.println(unique("yello"));
        System.out.println(unique("Yoghurt"));
        System.out.println(unique("Why"));
        System.out.println(unique("Scruble"));
    }
    //determine whether all characters in the string are unique
    public static boolean unique(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (seen.contains(s.charAt(i))) {
                return false;
            } else {
                seen.add(s.charAt(i));
            }
        }
       return true; 
    }
}
