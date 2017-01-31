/*
 * Mostly book solution, tried it, but failed at tracking the sides
 */
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] multi = new int[6][6];
        int curr = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                multi[i][j] = curr++;
            }
        }
        for (int[] s : multi) {
            System.out.println(Arrays.toString(s));
        }
        rotate(multi);;
        System.out.println("\n\nRotated Array\n");
        for (int[] s : multi) {
            System.out.println(Arrays.toString(s));
        }
    }
    //rotate a matrix
    public static int[][] rotate(int[][] arr) {
        int len = arr.length;

        //hard coded for now
        int layers = len / 2; 
        for (int layer = 0; layer < layers; layer++) {
            int first = layer;
            int last = len - 1 - layer;
            for (int i = first; i < last; i++) {
                
                int offset = i - first;

                //save top as temp
                int temp = arr[first][i];

                //set top to left
                arr[first][i] = arr[last - offset][first];

                //set left to bottom
                arr[last - offset][first] = arr[last][last - offset];

                //set bottom to right 
                arr[last][last - offset] = arr[i][last];

                //set top to left
                arr[i][last] = temp;
            }
        }
        return arr;
    }
}
