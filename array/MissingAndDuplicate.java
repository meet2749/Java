import java.util.ArrayList;

/**
 * MissingAndDuplicate
 */
public class MissingAndDuplicate {


    static ArrayList<ArrayList<Integer>>  find(int arr[]){
        if(arr.length == 0){
            return new ArrayList<>();
        }
        for (int i = 0; i < arr.length;) {
            if(arr[i] != arr[arr[i]] ){
                int other = arr[i];
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[other] = temp;
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> missing = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i]){
                missing.add(i);
                duplicates.add(arr[i]);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        result.add(missing);
        result.add(duplicates);

        return result;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,6,3};

        System.out.println(find(arr));

    }
    
}