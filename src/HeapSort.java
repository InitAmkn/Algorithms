import java.util.ArrayList;
import java.util.List;

public class HeapSort {

    //Реализовать алгоритм пирамидальной сортировки (сортировка кучей).


    public void sort(Integer[] arr) {
        sort(arr, 0);
    }

    private void sort(Integer[] arr, int skipPosition) {
        if (skipPosition >= arr.length) return;
        for (int j = arr.length - 1 - skipPosition; j >= 0; j--) {
            shiftMaxInFamily(arr, j, skipPosition);
        }

        int temp = arr[0];
        arr[0] = arr[(arr.length - 1) - skipPosition];
        arr[(arr.length - 1) - skipPosition] = temp;

        skipPosition++;
        sort(arr, skipPosition);

    }

    private void shiftMaxInFamily(Integer[] arr, int indexRoot, int skipPosition) {
        int indexLeft = (indexRoot * 2) + 1;
        int indexRight = (indexRoot * 2) + 2;

        if (indexLeft >= arr.length - skipPosition && indexRight >= arr.length - skipPosition) return;

        if (indexRight < arr.length - skipPosition) {
            if (arr[indexRoot] < arr[indexRight]) {
                int temp = arr[indexRoot];
                arr[indexRoot] = arr[indexRight];
                arr[indexRight] = temp;
            }
        }
        if (indexLeft < arr.length - skipPosition) {
            if (arr[indexRoot] < arr[indexLeft]) {
                int temp = arr[indexRoot];
                arr[indexRoot] = arr[indexLeft];
                arr[indexLeft] = temp;
            }
        }

        if (indexLeft < arr.length - skipPosition && indexRight < arr.length - skipPosition) {

            if (arr[indexRoot] < arr[indexRight]) {
                int temp = arr[indexRoot];
                arr[indexRoot] = arr[indexRight];
                arr[indexRight] = temp;

            }
            if (arr[indexRoot] < arr[indexLeft]) {
                int temp = arr[indexRoot];
                arr[indexRoot] = arr[indexLeft];
                arr[indexLeft] = temp;
            }
        }
    }


}
