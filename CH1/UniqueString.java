//Victor Pavao, 1/25/17

public class UniqueString {
	public static boolean uniqueString(String s) {
		boolean[] inString = new boolean[256];
		for(int i = 0; i < inString.length; i++) {
			inString[i] = false;
		}
		for(int i = 0; i < s.length(); i++) { //Run through string
			int asc = (int) s.charAt(i);
			if(inString[asc] == true) {
				return false;
			}
			else {
				inString[asc] = true;
			}
		}
	return true;
	}
	
	public static void main(String [] args) {
		System.out.println(uniqueString("abcdegg"));
		System.out.println(uniqueString("abcdefg"));
	}
}