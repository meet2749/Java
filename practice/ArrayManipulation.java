
public class ArrayManipulation {
    static long largest(long arr[]) {
        int i;

        // Initialize maximum element
        long max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    static long arrayManipulation(int n, int[][] queries) {
        long ans1[] = new long[n + 2];

        
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            ans1[a] = ans1[a] + k;
            ans1[b+1] = ans1[b+1] - k;

        }
        return getMax(ans1);


    }
    static long getMax(long arr[]){
        long max = Long.MIN_VALUE;

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] queries = { { 2, 6, 8, }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } };

        long ans = arrayManipulation(n, queries);
        System.out.println(ans);
    }
}