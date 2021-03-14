package dev.p4m;

public class SelectionSort {
    public static void Sort(int[] arr) {
        for (var i = 0; i < arr.length - 1; i++) {
            var min_element = arr[i];
            var min_index = i;
            for (var j = i; j < arr.length; j++) {
                if (arr[j] > min_element) {
                    min_element = arr[j];
                    min_index = j;
                }
            }
            arr[min_index] = arr[i];
            arr[i] = min_element;
        }
    }
}
