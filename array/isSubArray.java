import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class isSubArray {
    static boolean subarray(int arr[], int arr2[]){
        HashSet<Integer> m = new HashSet<>();
        for (Integer i : arr) {
            m.add(i);
        }
        for (Integer i : arr2) {
            if(!m.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {1,3,5,7,8,9,10};
        int arr2[] = {1,5,8};

        
        System.out.println(subarray(arr,arr2));
    }
}