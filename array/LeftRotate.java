package array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotate {


    static void leftRotate(int arr[], int d){
        
        int n = arr.length;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    static void reverse(int[] arr, int d, int n){

        int tmp ; 
        while(d<n){
            tmp = arr[d];
            arr[d] = arr[n];
            arr[n] = tmp;
            d++;
            n--;
        }
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        leftRotate(a, d);
        scanner.close();
    }
}
