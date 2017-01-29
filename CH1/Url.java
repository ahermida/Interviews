public class Url {
    public static void main(String[] args) {
        char[] stringly = {'c', 'a', 'r', 'b', ' ', 'n', ' ', 'x', 'x', 'x', ' ', 's', 'w', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's'};
        System.out.println(replace(stringly, 9)); 
    }
    public static String replace(char[] s, int length) {
        int count = length;
        for (int i = 0; i < length - 1; i++) {
            if (s[i] == ' ') {
                count += 2;
            }
        }
        int arrLengthFinal = count - 1;
        int arrLengthCurr = length - 1;
        while (arrLengthCurr >= 0) {

            if (s[arrLengthCurr] == ' ') {
                s[arrLengthFinal--] = '0';
                s[arrLengthFinal--] = '2';
                s[arrLengthFinal--] = '%';
            } else {
                s[arrLengthFinal--] = s[arrLengthCurr];
            }
            arrLengthCurr--;
        }
        return String.valueOf(s);
    }
}
