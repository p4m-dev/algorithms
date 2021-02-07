package dev.p4m;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int[] _GetRandomArray() {
        var min = 5;
        var max = 20;
        var random = new Random();
        var size = random.nextInt(max) + min;
        var arr = new int[size];
        for (var i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }

        return arr;
    }

    public static void main(String[] args) {
        var arr = _GetRandomArray();
        System.out.println("\n\nInsertion sort.");
        System.out.println("Source array: \t" + Arrays.toString(arr));
        InsertionSort.Sort(arr);
        System.out.println("Result: \t\t" + Arrays.toString(arr));

        arr = _GetRandomArray();
        System.out.println("\n\nSelection sort.");
        System.out.println("Source array: \t" + Arrays.toString(arr));
        SelectionSort.Sort(arr);
        System.out.println("Result: \t\t" + Arrays.toString(arr));
    }
}
