import java.util.Arrays;

public class Cycle {

    public static void main(String[] args) {
        int arr[] = {1,2};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}