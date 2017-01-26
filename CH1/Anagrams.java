import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("Dingo", "Ringo"));
        System.out.println(isAnagram("ognid", "dingo"));
        System.out.println(isAnagramFaster("Dingo", "Ringo"));
        System.out.println(isAnagramFaster("ogniD", "Dingo"));
    }
    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] stringArr1 = string1.toCharArray();
        char[] stringArr2 = string2.toCharArray();
        Arrays.sort(stringArr1);
        Arrays.sort(stringArr2);
        for (int i = 0; i < string1.length(); i++) {
            if (stringArr1[i] != stringArr2[i]) {
                return false;
            }
        }
        return true;
    } 
    public static boolean isAnagramFaster(String s1, String s2) {
        int[] charCount = new int[256];
        int[] charCount2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            charCount[(int) s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            charCount2[(int) s2.charAt(i)]++;
        }
        for (int i = 0; i < 255; i++) {
            if (charCount2[i] != charCount[i]) {
                return false;
            }
        }
        return true;
    }
}
