import java.util.*;
public class Appti4 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 4, 4, 4, 8, 0};
        int[] result = run(arr);
        System.out.println("Output : " + Arrays.toString(result));
    }
    public static int[] run(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != 0) {
                arr[i] += arr[i + 1];
                arr[i + 1] = 0;      
            }
        }
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}