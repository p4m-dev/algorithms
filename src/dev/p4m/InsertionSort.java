package dev.p4m;

public class InsertionSort {
    public static void Sort(int[] arr) {
        int i, key;
        for (var j = 1; j < arr.length; j++) {
            key = arr[j];
            i = j - 1;
            while (i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
}
