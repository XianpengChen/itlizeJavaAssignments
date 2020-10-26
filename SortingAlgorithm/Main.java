package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        //int[] sorted = shellSort(numbers);
        MergeSort ms = new MergeSort(numbers);
        ms.mergesort(0, 9);
        int[] sorted = ms.getNumbers();
        for (int i: sorted) {
            System.out.print(i + " ");
        }
    }
    private static int[] bubbleSort(int[] arr) {

        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            //对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数，最大数则不需再排序；
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    private static int[] selectionSort(int[] arr) {
        int length = arr.length;
        int minIndex, temp;
        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            //找未排序数列中最小值的index
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //交换最小值与当前值
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    private static int[] insertionSort(int[] arr) {
        int length = arr.length;
        int preIndex, current;
        for (int i = 1; i < length; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = current;
        }
        return arr;
    }
    private static int[] shellSort(int[] arr) {
        int length = arr.length;
        for (int i = (int) Math.floor(length/2); i > 0; i = (int) Math.floor(i/2)) {
            for (int j = i; j < length; j++) {
                int k = j;
                int current = arr[j];
                while (k - i >= 0 && current < arr[k-i]) {
                    arr[k] =arr[k-i];
                    k = k - i;
                }
                arr[k] = current;
            }
        }
        return arr;
    }
}
